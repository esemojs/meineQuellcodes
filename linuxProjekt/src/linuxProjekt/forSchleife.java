package linuxProjekt;

import java.util.Scanner;
/*
 * Zählschleife
 */
public class forSchleife {
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Eingabe Ende: ");
		int z = eingabe.nextInt();
		System.out.println("Eingabe Start");
		int i = eingabe.nextInt();
		
		for ( i=i; i<=z ; i +=1) {
			System.out.println("Zähle " + i);
		};
		System.out.println("Bingooooooooo");
	}

}
