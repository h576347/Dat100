package no.hvl.dat100;

public class Studentsamling {
	private final static int STDK = 100;
	private int antall;
	private Student [] samling; //usortert

public Studentsamling(int startKapasitet) {
	samling = new Student [startKapasitet];
	antall = 0;
}
	public Studentsamling () {
		this(STDK);
	}
	public static int getStdk() {
		return STDK;
	}
	public int getAntall() {
		return antall;
	}
	public Student[] getSamling() {
		return samling;
	}
	public boolean erTom() {
		return (antall == 0);
	}
	public void leggTil(Student student) {
		if ( antall < samling.length) {//ledig
			samling [antall] = student;
			antall ++;
		} else { //full
			System.out.println("Arkviet er fullt");
		}
	}
	
	private int finn(int nr) {
		int i = 0;
		int resultat = -1;
		boolean funnet = false;
		if (!erTom()) {
			while(!funnet && i <antall) {
				if ( nr == (samling[i].getStudentNr())){
					funnet = true;
				} else { //let videre
					i++;
				}
			}
			if (funnet) {
				resultat = i;
			}
		}
		return resultat;
	}
	
	public Student sok (int nr) {
		Student resultat = null;
		int indeks = finn(nr);
		if (indeks == -1) {
			resultat = null;
		}else {
			resultat = samling[indeks];
		}
	return resultat;
	}
	
	public Student fjern (int nr) {
		Student stud = null;
		int indeks = finn(nr);
		if ( indeks != -1) {
			stud = samling[indeks];
			samling [indeks] = samling [antall - 1];
			samling[antall - 1] = null;
			antall --;
		} //if
		return stud;
		} 
}

