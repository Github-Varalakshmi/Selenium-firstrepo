package javaPac;

import java.util.Scanner;

public class Fibonaci {
	private static Scanner sc;

	public static void main(String[] args) {
		int n1=0,n2=1,n3,n4;
		sc=new Scanner(System.in);
		System.out.println("Enter num");
		int n=sc.nextInt();
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		for(int i=2;i<=n;i++) {
			
			n3=n1+n2;
			 System.out.println("n3= "+n3);
			 
			 n1=n2;
			 n2=n3;
		}
		

	}

}
