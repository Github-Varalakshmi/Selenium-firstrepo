package javaPac;

public class StringFunc {

	public static void main(String[] args) {
		
		//CharAt();
		System.out.println("CharAt()");
		String s="varalakshmi is a good gilr";
		char ch=s.charAt(5);
		System.out.println("value:"+ch);

		//compareTo();
		System.out.println("compareTo()");
		String s1="vara";
		String s2="vara";
		String s3="Vara";
		String s4="Dhana";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s1));
		
		//endsWith();
		System.out.println("endsWith()");
		String v="varalakshmi";
		System.out.println(v.endsWith("mi"));
		System.out.println(v.endsWith("varalakshmi"));
		System.out.println(v.endsWith("m"));
		
		//equals();
		System.out.println("Equals()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		//equalsIgnoreCase();
		System.out.println("equalsIgnoreCase()");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		//format();
		System.out.println("format()");
		System.out.println(String.format("name of value %f", 32.33434));
		System.out.println(String.format("name of value %s", v));
		
		//Bytes();
		System.out.println("Bytes()");
		String v1="ABCDEFG";  
		byte[] barr=v1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}  
		
		//getChars();
		System.out.println("getChars()");
		String str = new String("hello javatpoint how r u");  
	      char[] ch1 = new char[10];  
	      try{  
	         str.getChars(6, 16, ch1, 0);  
	         System.out.println(ch1);  
	      }catch(Exception ex){System.out.println(ex);}  
	      
	      //indexOf();
	      System.out.println("indexOf()");
	      int index1=s.indexOf("is");
	      System.out.println(index1);
	      
	      //intern();
	      System.out.println("intern()");
	      String k=new String("vara");
	      String k1="vara";
	      String k3=k1.intern();
	      System.out.println(k==k1);
	      System.out.println(k1==k3);
	      
	      //isEmpty();
	      System.out.println("isEmpty()");
	      String k4="";
	      System.out.println(k1.isEmpty());
	      System.out.println(k4.isEmpty());
	      
	      //join();
	      System.out.println("Join()");  
	      String joinString1=String.join("_","welcome","to","vara","Lakshmi");  
	      System.out.println(joinString1); 
	      
	      //lastIndexOf();
	      System.out.println("lastIndexOf()");  
	      String ss="this is index of example"; 
	      int index2=ss.lastIndexOf('e');
	      System.out.println(index2); 
	      
	      //length();
	      System.out.println("Length()");  
	      System.out.println("Length is:"+ss.length());
	      
	      //replace();
	      System.out.println("replace()");  
	      System.out.println("replace   "+s.replace('a', 's'));
	      
	      //replaceAll();
	      System.out.println("replaceAll()"); 
	      String string="My name is vara, My name is Lakshmi, my name is Priya";
	      String sss=string.replaceAll("is", "was");
	      System.out.println(sss);
	      
	      //split();
	      System.out.println("Split()"); 
	      String[] split=string.split("\\s");
	      for(String w:split){  
	    	  System.out.println(w);  
	    	  }  
	      
	      // startsWith();
	      System.out.println("StratsWith()"); 
	      System.out.println(string.startsWith("My"));
	      System.out.println(string.startsWith("My Name")); 
	     
	      //subString();
	      System.out.println("substring()"); 
	      String t="Vara Lakshmi";
	      String t1=t.substring(2,4);
	      System.out.println(t1);
	      String t2=t.substring(5);
	      System.out.println(t2);
	      
	      //TocharArray();
	      System.out.println("ToCharArray()"); 
	      char[] cha=s1.toCharArray();  
	      for(int i=0;i<cha.length;i++){  
	      System.out.print(cha[i]);  
	      }  
	      
	      // toLowerCase() && toUpperCase();
	      System.out.println("ToLowerCase()"); 
	      String x=t.toLowerCase();
	      System.out.println(x);
	      System.out.println("ToUpperCase()");
	      String x1=t.toUpperCase();
	      System.out.println(x1);
	      
	      //trim();
	      System.out.println("Trim()");
	      String q="Hello vara  ";
	      System.out.println(q+"Lakshmi");
	      System.out.println(q.trim() +"Lakshmi");
	      
	      //ValueOf();
	      
	      int in=14;
	      System.out.println("ValueOf()");
	      String val=String.valueOf(in);
	      System.out.println(val + 50);
	
	}
	

}
