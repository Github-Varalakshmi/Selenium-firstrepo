package javaPac;

import java.util.Scanner;

public class Palindromprog {

	public static void main(String[] args) {
		int val,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter number");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	
	}

}
