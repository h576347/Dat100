package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Tidsoppgaveversjon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					else if (sekunder >= 60) {
						timer = 0;
						minutt = (sekunder/60);
						sekunder = (sekunder%60);
					}
				
					
					
				String utTxt = (timer + " Timer  " + minutt + " Minutter  " + sekunder + " Sekunder  ");
				showMessageDialog(null,utTxt);
		
 }

}
