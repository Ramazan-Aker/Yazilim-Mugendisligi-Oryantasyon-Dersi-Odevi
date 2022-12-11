//Kullanıcının giridiği sayıya kadar ikinin katlarını bulan program 
package odev;

import java.util.Scanner;

public class ikininKatları {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int a=scan.nextInt();
		int k=1;
		while(k<=a) {
			System.out.println(k);
			k=k*2;
		}

	}

}
