package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
		// Skrive inn bruttolønn og beregne skatt
		
		int tall = parseInt (showInputDialog ("Bruttolønn: "));
		
		double skatt = 0;
		if (tall <= 164100) {
			skatt = tall * 0;
			}
		else if (tall <= 230950){
			skatt = tall * 0.0093;
			}
		else if (tall <= 580650) {
			skatt = tall * 0.0241;
			}
		else if (tall <= 934050){
			skatt = tall * 0.1152;
			}
		else if (tall >= 934051){
			skatt = tall * 0.1452;
			}
		else {
			skatt = 0;
		}
		
		String utTxt = "Skatten du må betale er: " + skatt + "\n";
		showMessageDialog(null,utTxt);
	}

}
