package no.hvl.dat100;

public abstract class Student extends Person{
	
	protected int studentNr;
	protected String klasse;
	
	//Standardkonstruktør
	public Student() {
		fodselsnummer = 00000000000;
		etternamn = "";
		fornamn = "";
		studentNr = 000000;
		klasse = "";
	}
	//Konstruktør
	public Student(long fodselsnummer, String fornamn, String etternamn, int studentNr, String klasse) {
		this.fodselsnummer = fodselsnummer;
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		this.studentNr = studentNr;
		this.klasse = klasse;
	}
	
	public int getStudentNr() {
		return studentNr;
	}
	public String getKlasse() {
		return klasse;
	}
	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}
	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
	
}
