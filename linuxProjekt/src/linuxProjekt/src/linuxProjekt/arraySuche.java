package linuxProjekt;

import java.util.Scanner;

public class arraySuche {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		System.out.println("ArrayScann eingabe");
		int wert = eingabe.nextInt();

		int[] zahlenArray1 = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
		int[] zahlenArray2 = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3 };
		
		suche(zahlenArray1, wert);
		suche(zahlenArray2, wert);
	}

	public static void suche(int[] zahlenArray1, int wert) {
		for (int i = 0; i < zahlenArray1.length; i++) {

			if (zahlenArray1[i] == wert) {
				System.out.println("Gefunden");
				return; //wenn die Bedingung true wird, also [i] den die selbe Zahl findet, wie der wert dann wird mit return die schleife beendet. Sonst geht die schleife so lange, bis sie false ist. 
			}
		}
		System.out.println("Falschhh");
	}

}
