//Kullanıcı tarafından girilen sayının faktöriyelin hesaplayan program
package odev;

import java.util.Scanner;

public class faktoriyelHesaplama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,fakt=1;
     System.out.println("bir sayı giriniz");
     a=scan.nextInt();
     while(a>0) {
    	 fakt=fakt*a;
    	 a--;
     }System.out.println(fakt);
	}

}
