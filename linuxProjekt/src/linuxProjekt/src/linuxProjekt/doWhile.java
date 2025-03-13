package linuxProjekt;


import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int passwort, fehler = 3;
		do {
			System.out.println("Passwort eingeben");
			passwort = eingabe.nextInt();
			
			

		} while (passwort != 100);
		System.out.println("Sie werden eingeloggt");
	}
}
