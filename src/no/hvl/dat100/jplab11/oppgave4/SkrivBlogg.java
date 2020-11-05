package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		String file_name = filnavn;
		PrintWriter writer;
		try {
			writer = new PrintWriter(file_name);
		} catch (FileNotFoundException e) {
			return false;
		}
		
		writer.print(samling.toString());
		writer.close();

		return true;
	}
}
