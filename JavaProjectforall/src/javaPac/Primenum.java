package javaPac;

public class Primenum {

	public static void main(String[] args) {
		int n=17,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println("Not a prime");
			
		}else {
			for(int i=2;i<=m;i++){
				if(n%i==0) {
					System.out.println("Not a prime");
					flag=1;
					break;
				}
			}
				}
					if(flag==0) {
						System.out.println("Prime num");
					}
				
	}
}
	
		
	
		


