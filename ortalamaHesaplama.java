//kullanıcının girdiği notların ortalamasını hesaplayan ve sınıfı geçip geçmediği söyleyen program 
package odev;

import java.util.Scanner;

public class ortalamaHesaplama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int vize,ffinal;
double ortalama;
System.out.println("Vize ve Fİnal Notunuz Giriniz");
vize=scan.nextInt();
ffinal=scan.nextInt();
ortalama=vize*0.4+ffinal*0.6;
System.out.println("ortalamanız:"+ortalama);
if(ortalama>=50) {
	System.out.println("Sınıfı geçtiniz");
}else 
	System.out.println("Sınıfı geçemediniz");
	}

}
