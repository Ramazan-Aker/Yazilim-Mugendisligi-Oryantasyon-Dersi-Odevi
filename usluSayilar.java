//üslü sayı hesaplayan program
package odev;

import java.util.Scanner;

public class usluSayilar {
      public static void main(String[]args) {
    	  Scanner scan=new Scanner(System.in);
    	  int s1,s2,sonuc=1;
    	  System.out.println("üssünü almak istediğiniz sayıyı giriniz");
    	  s1=scan.nextInt();
    	  System.out.println("üssünü giriniz");
    	  s2=scan.nextInt();
    	  for(int i=1;i<=s2;i++) {
    		  sonuc=sonuc*s1;
    	  }System.out.println(sonuc);
      }
}
