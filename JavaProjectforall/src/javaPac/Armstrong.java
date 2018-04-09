package javaPac;

import java.util.Scanner;

public class Armstrong {

	private static Scanner sc;

	public static void main(String[] args) {
		int sum=0;
		sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			int val=n%10;
			n=n/10;
			 sum=sum+(val*val*val);
			
			//System.out.println(sum);
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a Armstrong");
		}
	}

}
