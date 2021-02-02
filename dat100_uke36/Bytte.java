package no.hvl.dat100;

public class Bytte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tall1 = 10;
		int tall2 = 20;
		
		//kall
		bytte(tall1,tall2);
		System.out.println("tall 1 er " + tall1 + " tall 2 er " + tall2);
		
	}
	
	private static void bytte(int x, int y ) {
	
			int temp = x;
			x = y;
			y = temp;
	}
	
}
