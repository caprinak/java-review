package com.capri.sample;

public class StringGetCharsExample {

	public static void main(String[] args) {
		String str = new String("hello javatpoint how r u");  
		
		 char[] ch = new char[10];  
	      try{  
	         str.getChars(6, 15, ch, 0);  
	         System.out.println(ch);  
	      }catch(Exception ex){System.out.println(ex);}  
	      
	      //replace Exp
	      String str1 = "oooooo-hhhh-oooooo";  
	        String rs = str1.replace("h","s"); // Replace 'h' with 's'  
	        System.out.println(rs);  
	        rs = rs.replace("s","h"); // Replace 's' with 'h'  
	        System.out.println(rs);  

	}

}
