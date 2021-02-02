package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;

public class Kinopris {

	public static void main(String[] args) {
		String prisTxt = showInputDialog("Fullpris");
		double pris = parseDouble(prisTxt);
		String alderTxt = showInputDialog("Alder");
		int alder = parseInt(alderTxt);
		
		if(alder <=5 ) { //Gratis
			pris= 0.0;
		} else if (alder >= 12 || alder >=60) {
			//Halv pris
			pris = pris / 2.0;
		}
		showMessageDialog(null, "pris: " + pris);
	}  

}
