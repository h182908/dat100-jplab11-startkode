package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	public int lengde;
	public Innlegg[] samling; 

	public Blogg() {
		this.lengde = 20;
		this.samling = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.lengde = lengde;
		this.samling = new Innlegg[lengde];
	}

	public int getAntall() {
		int counter = 0;
		for(Innlegg obj : this.samling) {
			if(obj != null) {
				counter++;
			}
		}
		return counter;
	}
	
	public Innlegg[] getSamling() {
		return this.samling;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < this.lengde; i++) {
			if(this.samling[i] != null && innlegg.erLik(this.samling[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(Innlegg obj : this.samling) {
			if(obj != null && innlegg.erLik(obj)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		for(Innlegg obj : this.samling) {
			if(obj == null) {
				return true;
			}
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!this.finnes(innlegg)) {
			for(int i = 0; i < this.lengde; i++) {
				if(this.samling[i] == null) {
					this.samling[i] = innlegg;
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		String n = "\n";
		String output = this.getAntall() + n;
		for(Innlegg obj : this.samling) {
			if(obj != null) {
				output += obj.toString();
			}
		}
		return output;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] utvid_innlegg = new Innlegg[this.lengde*2];
		for(int i = 0; i < this.lengde; i++) {
			utvid_innlegg[i] = this.samling[i];
		}
		this.samling = utvid_innlegg;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		if(!this.ledigPlass()) this.utvid();
		
		this.leggTil(innlegg);
		return true;
	}
	
	public boolean slett(Innlegg innlegg) {
		if(this.finnes(innlegg)) {
			for(int i = 0; i < this.lengde; i++) {
				if(this.samling[i] != null && this.samling[i].id == innlegg.id) {
					this.samling[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}