package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	public int id;
	public String bruker;
	public String dato;
	public int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return this.bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;

	}

	public int getLikes() {
		return this.likes;

	}
	
	public void doLike () {
		this.likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		boolean id = (this.id == innlegg.getId());
		
		return id;
	}
	
	@Override
	public String toString() {
		String n = "\n";
		
		return this.id + n + this.bruker + n + this.dato + n + this.likes + n; 		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
