package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TidsOppgaven {

	public static void main(String[] args) {
		// Gjere om sekunder til timer, minutter og sekunder
		int sekunder = parseInt (showInputDialog("Skriv inn sekunder:"));
		int timer = 0;
		int minutt = 0;
		
		
		if (sekunder >= 3600) {
			timer = (sekunder/(60*60));
			int x = (sekunder%(60*60));
			minutt = (x/60);
			sekunder = (x%60);
		}
			
			
		String utTxt = (timer + " Timer  " + minutt + " Minutter  " + sekunder + " Sekunder  ");
		showMessageDialog(null,utTxt);
	}

}
