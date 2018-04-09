package collectionProg;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		Student s1=new Student (18,"Vara",23);
		System.out.println("*****************");
		Student s2=new Student (19,"Dhana",24);
		Student s3=new Student (17,"Priya",25);
		Student s4=new Student (16,"Vyshu",22);
		
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		
		ArrayList<Student>list1=new ArrayList<Student>();
		list1.add(s3);
		list1.add(s4);
		list.addAll(list1);
		Iterator r=list.iterator();
		while(r.hasNext()) {
			Student st=(Student)r.next();
			System.out.println(st.rollno +" "+ st.Name +" "+st.age);
		}
	}

}
