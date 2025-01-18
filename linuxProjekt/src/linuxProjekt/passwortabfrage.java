package linuxProjekt;

import java.util.Scanner;

public class passwortabfrage {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int passwort, fehler = 3;
		String email;
		do {
			System.out.println("E-Mail Adresse eingeben");
			email = eingabe.next().toLowerCase();

			System.out.println("Passwort eingeben");
			passwort = eingabe.nextInt();
			--fehler;
			if ((passwort != 100) || (!(email.equals("esemojs")))) {
				System.out.printf("Fehlerhafte Credentials. Sie haben noch %d versuche\n", fehler);
				if (0 == fehler) {
					System.err.println("Ihr Konto wurde gesperrt");
					System.out.println("Wenden Sie sich an den Administrator");

					System.exit(0);
				}
			}

		} while ((passwort != 100) || (!(email.equals("esemojs"))));
		/*
		 * || limitiert die Bedingung. Wenn eins falsch ist, dann wird "do" weiter
		 * ausgeführt. Mein Fehler mit && war, dass wenn eins false war, also eine
		 * Eingabe richtig, hat der Ausdruck insgesamt false gegeben und der Codebock
		 * wurde nach unten verlassen.
		 */
		System.out.println("Sie werden eingeloggt");
	}
}
