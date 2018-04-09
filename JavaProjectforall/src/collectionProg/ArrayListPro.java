package collectionProg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPro {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Vara");
		list.add("Hema");
		list.add("Hari");
		list.add("Priya");
		
		Iterator r=list.iterator();
		
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
	}

}
