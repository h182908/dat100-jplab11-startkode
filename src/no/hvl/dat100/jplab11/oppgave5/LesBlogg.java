package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		String file_name = filnavn;
	
		try {
			File blogg_file = new File(mappe + file_name);
			
			Scanner reader = new Scanner(blogg_file);
			int n = Integer.parseInt(reader.nextLine());
			Blogg blogg = new Blogg(n);
			
			while(reader.hasNext()) {
				String type = reader.nextLine();
				if(type.equals("TEKST")) {
					String[] input = new String[5];

					for(int i = 0; i < 5; i++) {
						input[i] = reader.nextLine();
					}
					
					Tekst innlegg = new Tekst(Integer.parseInt(input[0]), input[1], input[2], Integer.parseInt(input[3]), input[4]);
					blogg.leggTilUtvid(innlegg);
				}
				else if(type.equals("BILDE")) {
					String[] input = new String[6];
					
					for(int i = 0; i < 6; i++) {
						input[i] = reader.nextLine();
					}
					
					Bilde innlegg = new Bilde(Integer.parseInt(input[0]), input[1], input[2], Integer.parseInt(input[3]), input[4], input[5]);
					blogg.leggTilUtvid(innlegg);
				}
			}
			
			reader.close();
			
			return blogg;
		} 
		catch(Exception e) {
			return null;	
		}
	}
}
