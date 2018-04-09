package javaPac;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		 
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		System.out.println(Pattern.matches("[a-z&&[^m-q]]", "q"));
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]*", "annnnaaa"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
}

}
