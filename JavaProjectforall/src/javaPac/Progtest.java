package javaPac;

import java.util.Scanner;

public class Progtest {

	public static void main(String[] args) {
//		int i;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a num");
//		int n=sc.nextInt();
//		System.out.println(n);
//		for(i=0;i<=n;i++) {
//			if(i!=n) {
//				System.out.println("given num is correct");
//			}
//			else {
//				System.out.println("given num is incorrect");
//			}
//		}
	
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter Student name:");
	//String sname=sc.nextLine();
	//System.out.println("Enter Student class:");
	//String Sclass=sc.nextLine();
	System.out.println("Enter M1 marks:");
	int M1=sc.nextInt();
	System.out.println("Enter M2 markes:");
	int M2=sc.nextInt();
	System.out.println("Enter M3 marks:");
	int M3=sc.nextInt();
	double total=M1+M2+M3;
	double avg=total+(total/100);
	
	System.out.println("Total Marks"+total);
	System.out.println("Avg"+avg);
	
	
	
	
	
	
	
	
	}

}
