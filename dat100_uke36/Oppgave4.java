package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Oppgave4 {

	public static void main(String[] args) {
		// Skrive ut oddetall innenfor et område
		int nedreGrense = parseInt (showInputDialog ( "Skriv inn nedre grense:"));
		int ovreGrense = parseInt (showInputDialog ("Skriv inn øvre grense:"));
		
		//tar vare på nedregrense-verdien
		int x = nedreGrense; 
		
		if ( x % 2 != 0) {
			String output = "";
		for (x = nedreGrense; x <= ovreGrense; x +=2)
				output = output + "," + x;
			showMessageDialog(null,"Nedre grense: " + nedreGrense + "  Øvre grense: " + ovreGrense + "  Oddetall: " + output);
	}
	
			else if(x % 2 == 0) {
				int y = nedreGrense;
				x = y++;
				String output = "";
			for (x = y++; x <= ovreGrense; x+=2)
				output = output + x + ",";
			showMessageDialog(null,"Nedre grense: " + nedreGrense + "  Øvre grense: " + ovreGrense + "  Oddetall: " + output);
		}	
		 
		
	}
}
