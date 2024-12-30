package meineQuellcodes;


import java.util.Scanner;
/*
 * Zählschleife
 */
public class forSchleife {
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Eingabe Ende: ");
		int z = eingabe.nextInt();
		
		for (int i=1; i<=z ; i +=1) {
			System.out.println("Zähle " + i);
		};
		
	}

}
