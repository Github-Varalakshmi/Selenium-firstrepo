package collectionProg;

import java.util.ArrayList;

public class ArrayListforeach {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Test");
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		for(String obj:list)
			
		System.out.println(obj);

	}

}
