//Yarıçapı kullanıcı tarafından girilen dairenin alanını  hesaplayan program
package odev;

import java.util.Scanner;

public class DaireninAlanı {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r;
		double alan,pi=3.14;
		System.out.println("yarıçap değerini giriniz");
		r=scan.nextInt();
		alan=pi*r*r;
		System.out.println(r+" yarıçaplı dairenin alanı " +alan+" dır");
	}

}
