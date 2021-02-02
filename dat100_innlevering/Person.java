package no.hvl.dat100;
//Oppgave 1
public abstract class Person {

	//Objektvariablene
	protected long fodselsnummer;
	protected String etternamn;
	protected String fornamn;
	
	//Standard Kontstruktør
	public Person() {
		fodselsnummer = 00000000000;
		etternamn = "";
		fornamn = "";
		
	}
	//konstruktør
	public Person(long fodselsnummer, String fornamn, String etternamn) {
		this.fodselsnummer = fodselsnummer;
		this.fornamn = fornamn;
		this.etternamn = etternamn;
	}
	
	public String toString() {
		return "Fødselsnummer: " + fodselsnummer + "Etternavn: " + etternamn + "Fornavn: " + fornamn;
	}
	
	
	public long getFodselsnummer() {
		return fodselsnummer;
	}
	public String getEtternamn() {
		return etternamn;
	}
	public String getFornamn() {
		return fornamn;
	}
	public void setFodselsnummer(long fodselsnummer) {
		this.fodselsnummer = fodselsnummer;
	}
	public void setEtternamn(String etternamn) {
		this.etternamn = etternamn;
	}
	public void setFornamn(String fornamn) {
		this.fornamn = fornamn;
	}
	
		
	
	
	
}
