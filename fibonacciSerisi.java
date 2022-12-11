//kullanıcının girdiği sayı kadar fibonacci serisini yazan program
package odev;

import java.util.Scanner;

public class fibonacciSerisi {

	public static void main(String[] args) {
	//0,1,1,2,3,5	
     Scanner scan=new Scanner(System.in);
     int s1=0,s2=1,toplam;
     System.out.println("Bir sayı giriniz");
     int a=scan.nextInt();
     for(int i=1;i<=a;i++) {
    	 System.out.print(s1+",");
    	 toplam=s1+s2;
    	 s1=s2;
    	 s2=toplam;
     }
	}

}
