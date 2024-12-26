package meineQuellcodes;

public class operatorenUebungen {

	public static void main(String[] args) {
		int x = 10, y =5;
		char buchstabe = 'f';
		boolean z = true;
		
		System.out.println(x < 9 || y >= 11); //false
		System.out.println(x > 9 || (y > 7 && buchstabe == 'f'));//true
		System.out.println(x < 5 || y < 11 && (buchstabe != 'a'|| x==4));//true
		System.out.println(!(x == 10 && y <11));//false
		System.out.println(!(x==10));//false
		System.out.println(z);//true
		System.out.println(!(x != 10) && ((!(buchstabe != 'f') && x < 11) && !z));//false
		System.out.println((x == 10 || y > 5) && (!(buchstabe == 'a') || !z));//true
		System.out.println(!z);//false
		System.out.println((x != 10 && y <= 5) || ((buchstabe == 'f' && !z) || (x < 20 && z)));
	}

}
