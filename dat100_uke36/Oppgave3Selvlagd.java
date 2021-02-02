package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3Selvlagd {

	public static void main(String[] args) {

		int n = parseInt(showInputDialog("Skriv inn et heltall:"));

		System.out.println("" + n + "! er " + fakultet(n) + "\n");

	}

	public static long fakultet(int n) {
		long fak = 1;
		for (int i = 1; i <= n; i++) {
			fak = fak * i;

		}
		return fak;
	}
}
