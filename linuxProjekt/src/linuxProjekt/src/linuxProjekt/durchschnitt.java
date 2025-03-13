package linuxProjekt;


import java.util.Scanner;

public class durchschnitt {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		double zahl1, zahl2= 0, durchschnitt = 0,summe=0;
		short counter = 0;

		for (int i = 0; i < 10; ++i) {
			for (int o = 0; o < 5; ++o) {
				System.out.printf(" Durchschnittsrechner");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		System.out.println("Ergebnis mit Taste 0");
		System.out.printf("\n");
		
		do {
			System.out.printf("Zahl eingeben: ");
			zahl1 = eingabe.nextDouble();
			if (zahl1 != 0) {
				++counter;
				summe += zahl1;
			}
		}

		while (zahl1 != 0);
		System.out.println("Ergebnis");
		durchschnitt = summe/ counter;
		System.err.println(durchschnitt);
		
	}

}
