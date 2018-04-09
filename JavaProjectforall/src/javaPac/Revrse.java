package javaPac;

import java.util.Scanner;

public class Revrse {

	private static Scanner sc;

	public static void main(String[] args) {
		int val, sum=0;
		sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			val=n%10;
			sum=(sum*10)+val;
			n=n/10;
			System.out.println("Reverse of the number"+sum);
		}
	}

}
