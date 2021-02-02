package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

import java.util.Arrays;


public class Grensesnitt {
	//objekt-metoder for lesing og skriving
	Grensesnitt(){} //Tom konstruktør


public static Student lesStudent() {
			String tallTxt = showInputDialog("Oppgi studentnr: ");
			int nr = parseInt(tallTxt);
			String fornavn = showInputDialog("Oppgi et fornavn: ");
			String etternavn = showInputDialog("oppgi et etternavn: ");
			Student student = new Student(nr, fornavn, etternavn);
			return student;
			
		}
		
		public static void skrivStudent(Student student) {
			
			/*
			System.out.println(student.toString());
			System.out.println();
			 */
			String utTxt = student.toString();
			showMessageDialog(null,utTxt);
		
		}
		
		public void visAlleSortert(Studentsamling reg ) {
			System.out.println("\nSkriver ut Studentopplysningene sortert");
			//Sorterer en tabell som er strengobjekter av studentoppl
			
			int stor = reg.getAntall();
			String[] nrTab = new String[stor]; //Akkurat stor nok tabell
			for ( int i = 0; i < nrTab.length; i++) {//Full tabell
				nrTab[i] = reg.getSamling () [i].skrivstudentNr();
			}
			Arrays.sort(nrTab); //Kall til metode i klassen Arrays
								// Slik det er gjort i boken
			//Sortert utskrift etter studentnr
			for (int i = 0; i < nrTab.length; i++) {
				System.out.println(nrTab[i]);
			}
		}

}
