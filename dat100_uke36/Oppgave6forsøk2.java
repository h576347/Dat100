package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Oppgave6forsøk2 {

	public static void main(String[] args) {
		
		String karakter = "";
		boolean gyldigInndata;
		String feilmelding = "Ugyldig poengsum (negativ verdi eller over 100";
		int poenggrense = 0;
		
		/* do-while-l�kke ved innlesing */
		for (int i = 1; i<=10; i++) {
		do {
			poenggrense = parseInt(showInputDialog("Skriv inn poeng "));
			gyldigInndata = (poenggrense >= 0) && (poenggrense <= 100);
			if (!gyldigInndata) {
				showMessageDialog(null, feilmelding);
			}
		} while (!gyldigInndata);

	
		if (poenggrense >= 90) {
			karakter = "A";
		} 
		else if (poenggrense >= 80) {
			karakter = "B";
		} 
		else if (poenggrense >= 60) {
			karakter = "C";
		} 
		else if (poenggrense >= 50) {
			karakter = "D";
		} 
		else if (poenggrense >= 40) {
			karakter = "E";
		} 
		else if (poenggrense >= 0) {
			karakter = "F";
		}

		showMessageDialog(null, karakter);
		
		}

	}

}
