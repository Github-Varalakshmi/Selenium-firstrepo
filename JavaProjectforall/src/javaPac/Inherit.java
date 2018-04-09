package javaPac;

public class Inherit {
	
	//int a;
	//String name;
	void display() {
		System.out.println("method");
	}
}
	
class B extends Inherit {
	//this.display();
	void M(){System.out.println("Inside class");}
	
	
	public static void main(String[] args) {
		B t=new B();
		t.display();
	}

}
