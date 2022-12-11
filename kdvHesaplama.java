//kdvsiz fiyatı girilen ürünün kdvli fiyatını hesaplayan program
package odev;

import java.util.Scanner;

public class kdvHesaplama {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double fiyat,kdvliFiyat,KDV=0.18;
		System.out.println("ürünün fiyatını giriniz");
		fiyat=scan.nextDouble();
		kdvliFiyat=(fiyat*KDV)+fiyat;
		System.out.println(kdvliFiyat);

	}

}
