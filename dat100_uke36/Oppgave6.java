package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave6 {

	public static void main(String[] args) {

		int poenggrense = parseInt(showInputDialog("Skriv inn poenggrense: "));
		String karakter = "";

		if (poenggrense >= 100 || poenggrense < 0) {
			karakter = "UGYLDIG KARAKTER!";
		} 
		else if (poenggrense <= 90) {
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
