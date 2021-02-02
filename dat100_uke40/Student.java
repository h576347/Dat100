package no.hvl.dat100;

public class Student {
	private int studentNr;
	private String fornavn;
	private String etternavn;
	
	/*Konstruktør
		public Student() {
			studentNr = 0;
			fornavn = "";
			etternavn = "";
		}
		*/
	public Student(int studNr, String fnavn, String enavn) {
		studentNr = studNr;
		fornavn = fnavn;
		etternavn = enavn;
	}
	//enklere konstruktør
	public Student() {
		this(0,"","");
	}
		
	public int getStudentNr() {
		return studentNr;
	}
	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public static boolean erLik(Student denAndre) {
		//Behøver ikke bruke get-metode på denAndre
		boolean lik = true;
		if ( denAndre==null) {
			lik = false;
		} else {
			lik = this.studentNr == denAndre.studentNr;
		}
		return lik;
	}

	@Override
	public String toString() {
		String streng = format("%-10d")
		return "Student [studentNr=" + studentNr + ", fornavn=" + fornavn + ", etternavn=" + etternavn + "]";
	}
	
	
}
