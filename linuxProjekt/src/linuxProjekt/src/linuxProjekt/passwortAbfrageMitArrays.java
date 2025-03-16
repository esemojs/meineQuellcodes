package linuxProjekt;

import java.util.Scanner;

public class passwortAbfrageMitArrays {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		String[] emails = { "esemojs@mailfence.com", "hombre69@mailfence.com", "nasok34@mailfence.com" };
		int[] passwortArray = { 42431, 213, 5234 };
		String adresseEingabe;
		int i;
		boolean emailFalsch = true; 
		int zählerPW = 3;
//		System.out.println("Emailadresse eingeben");
//		String adresseEingabe = eingabe.next().toLowerCase();

		do {

			System.out.println("Emailadresse eingeben");

			adresseEingabe = eingabe.next().toLowerCase();
			for (i = 0; i < emails.length; i++) {
			
				if(adresseEingabe.equalsIgnoreCase(emails[i])) {
					emailFalsch = false;
					break;
				}
			--zählerPW;
			
			System.out.printf("E-Mail falsch, sie haben noch %d Versuche\n", zählerPW);
			
			if(zählerPW <= 1) {
				System.out.println("Gesperrt");
				System.exit(0);
			}
			}
			
		} while (emailFalsch);
		
		System.out.println("Bitte Passwort eingeben");
	}

}
