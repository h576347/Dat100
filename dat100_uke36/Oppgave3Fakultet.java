package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3Fakultet {

	public static void main(String[] args) {
		boolean ulovlig;
		int n;
		
		do { //Leser inn lovlig n-verdi
			String tallTxt = showInputDialog ("Gi et heltall:");
			n = parseInt(tallTxt);
			ulovlig = (n < 0);
			if ( ulovlig)
				showMessageDialog(null, "Ugyldig n-verdi!");
		}while (ulovlig);
		
		showMessageDialog(null, n + "! = " + fakultet(n) );
		}
		public static int fakultet(int maxTall) {
			int nFak = 1;
			for (int tall=1; tall <=maxTall; tall++)
				nFak = nFak * tall;
			return nFak;
	}

}
