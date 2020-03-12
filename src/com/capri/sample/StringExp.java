package com.capri.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExp {

	public static void main(String[] args) {
		String s1 = "Hello"; //cached in string pool
		s1.toUpperCase();
		// immutable
		System.out.println(s1);
		
		String s2 = "Hello";// s2 also points to the same obj as s1
		System.out.println(s1.equals(s2)); 
		
		
		//this string is not interned.
		String s3 = new String("Hello"); 
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(" index: "+ s2.indexOf("lo"));
		
		String s4 = "Hello world";
		boolean test = s4.matches("(.*)world");
		
		System.out.println(test);
		
		
		Pattern p = Pattern.compile(".s"); //represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		boolean b3 = Pattern.matches(".s", "as");  
		System.out.println(b+" "+b2+" "+b3);  
		System.out.println(Pattern.matches(".s", "amms"));
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		System.out.println(Pattern.matches("[amn]*", "ammmna")); //true (a or m or n may come zero or more times)  
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aruna2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
		
		
	}

}
