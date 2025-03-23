package linuxProjekt;

import java.util.Scanner;

public class eigenerFahrkartenAutomat {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		System.out.println(begruessung(""));
		double gesamtPreis = berechnungDerKosten(eingabe);
		bezahlvorgang(eingabe, gesamtPreis);
		
		

	}

	public static String begruessung(String hallo) {
		hallo = "Das ist mein privater Fahrkartenautomat Willkommen";
		return hallo;
	}

	public static double berechnungDerKosten(Scanner eingabe) {

		short anzahlFahrkarten;
		double preisFahrkarte = 2.50;
		double gesamtPreis;

		System.out.printf("Wie viele Fahrkarten möchten Sie kaufen?\n>> ");
		anzahlFahrkarten = eingabe.nextShort();
		System.out.printf("Sie haben %d Fahrkarten ausgewählt\n", anzahlFahrkarten);

		gesamtPreis = preisFahrkarte * anzahlFahrkarten;

		if (anzahlFahrkarten > 5) {
			gesamtPreis = gesamtPreis * 0.90;
			System.out.printf("Sie erhalten 10%% Rabat, der Gesamtpreis beträgt %.2f €\n\n", gesamtPreis);
		} else {
			System.out.printf("Der Gesamtpreis beträgt %.2f €\n\n", gesamtPreis);
		}
		return gesamtPreis;

	}
	public static double bezahlvorgang (Scanner eingabe, double gesamtPreis) {
		double eingezahlterBetrag = 0.0;
		double nochZuZahlen;
		nochZuZahlen = gesamtPreis - eingezahlterBetrag;

		while (nochZuZahlen > 0) {
			System.out.printf("Bitte zahlen Sie noch %.2f € \n>>", nochZuZahlen);
			eingezahlterBetrag = eingabe.nextDouble();
			nochZuZahlen -= eingezahlterBetrag;

			if (nochZuZahlen < 0) {
				System.out.printf("Sie bekommen %.2f € Rückgeld", nochZuZahlen);

			}
		}return nochZuZahlen;
	}
}
