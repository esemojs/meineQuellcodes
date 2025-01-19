package linuxProjekt;

import java.util.Scanner;

public class ifElseSchleife {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		System.out.println("Gib dein Größe in cm ein");
		int groesse = eingabe.nextInt();
		
		if (groesse < 160) {
			System.out.println("Kleiner Furz");
		}else if(!(groesse <160 || groesse > 170)){
			System.out.println("Mittlerer Furz");
		}else if (groesse >= 171 && groesse <= 180) {
			System.out.println("Großer Furz");
		}else
			System.out.println("Riese");
	}
}
