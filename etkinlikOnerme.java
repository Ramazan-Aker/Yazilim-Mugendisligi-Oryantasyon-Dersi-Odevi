//Kullanıcı tarafından girilen sıcaklığa göre etkinlik öneren program
package odev;

import java.util.Scanner;

public class etkinlikOnerme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sıcaklık;
		System.out.println("Sıcaklık değerini giriniz");
sıcaklık=scan.nextInt();
if(sıcaklık>30) {
	System.out.println("Bu havada yğzmeye gidebilirsiniz");
}else if((sıcaklık>10)&&(sıcaklık<30)) {
	System.out.println("sinemaya gidebilirsiniz ");
}else 
	System.out.println("kayak yapmaya gidebilirsiniz");
	}

}
