package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class KlientStudent {

	public static void main(String[] args) {
		Student stud = Grensesnitt.lesStudent();
		Grensesnitt.skrivStudent(stud);
		
		// ... utvidelse
		Student malin = new Student (131618, "Malin", "dal");
		//Før endring
		System.out.println(malin);
		//System.out.println(malin(toString));
		//Etter endring
		//Gi malin-objektet et nytt innhold
		lesStudent(malin);
		System.out.println(malin);
	}
		static void lesStudent(Student enStudent) {
			//kan endre tilstanden til objektet
			String tallTxt = showInputDialog("Oppgi studentnr: ");
			int nr = parseInt(tallTxt);
			enStudent.setStudentNr(nr);
			String fnavn = showInputDialog("Oppgi et fornavn: ");
			enStudent.setFornavn(fnavn);
			String enavn = showInputDialog("oppgi et etternavn: ");
			enStudent.setEtternavn(enavn);
		}
		
	
		/*
		Student ole = new Student (141718, "Ole", "Olsen");
		Student ole2 = new Student (141718, "", "");
		
		
		System.out.println(ole);
		//System.out.println(Ole(toString));
		
		if (malin.erLik(ole)) {
			System.out.println("Like");
		}else {
			System.out.println("Ulike");
		}
		
		if (ole.erLik(ole2)) {
			System.out.println("Like");
		}else {
			System.out.println("Ulike");
		}
		*/
	

}
