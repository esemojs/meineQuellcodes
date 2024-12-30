package linuxProjekt;

import java.util.Scanner;

public class passwortabfrage {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int passwort, fehler = 3;
		do {
			System.out.println("Passwort eingeben");
			passwort = eingabe.nextInt();
			--fehler;
			if (passwort != 100) {
				System.out.printf("Nach 3 falschen Versuchen wird ihr Konto gesperrt. Sie haben noch %d versuche\n",
						fehler);
				if (0 == fehler) {
					System.err.println("Ihr Konto wurde gesperrt");
					System.out.println("Wenden Sie sich an den Administrator");
					
					System.exit(0);
				}
			}

		} while (passwort != 100);
		System.out.println("Sie werden eingeloggt");
	}
}
