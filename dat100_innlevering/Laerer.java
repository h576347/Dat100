package no.hvl.dat100;

public abstract class Laerer extends Person{
	
	protected int mndlønn;
	protected int kontonummer;

	public Laerer() {
		fodselsnummer = 00000000000;
		etternamn = "";
		fornamn = "";
		mndlønn = 00000;
		kontonummer = 00000000000;
	}
	public Laerer(long fodselsnummer, String fornamn, String etternamn, int mndlønn, int kontornummer) {
		this.fodselsnummer = fodselsnummer;
		this.fornamn = fornamn;
		this.etternamn = etternamn;
		this.mndlønn = mndlønn;
		this.kontonummer = kontornummer;
	}
	
	public int getMndlønn() {
		return mndlønn;
	}
	public int getKontonummer() {
		return kontonummer;
	}
	public void setMndlønn(int mndlønn) {
		this.mndlønn = mndlønn;
	}
	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}
}
