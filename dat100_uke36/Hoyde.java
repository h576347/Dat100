package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Hoyde {

	public static void main(String[] args) {
		String melding = "Hoyde i cm, avslutt med 0:";
		int sum = 0; //Summen av hoyder
		int antall = 0; // antall hoyder
		//Første innlesning
		int hoyde = parseInt( showInputDialog(melding));
		
		while (hoyde != 0) {
			sum = sum + hoyde;
			antall++;
			hoyde =  parseInt( showInputDialog(melding));
			
		}
		showMessageDialog(null, "Gi snitt " + (double)sum/antall);
			
		/*
		 * while (uttrykk) {//evaluer hoyde
		 * 	summere hoyde
		 * 	øke antall
		 * 	lese inn neste hoyde
		 * }
		 * Beregne og skrive ut gj.sn.hoyde
		 */

	}

}
