package com.capri.sample;

public class LocalInner1 {
//A class i.e. created inside a method is called local inner class in java. 
	//If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
		private int data=30;//instance variable  
		 void display(){  
		  class Local{  
		   void msg(){System.out.println(data);}  
		  }  
		  Local l=new Local();  
		  l.msg();  
		 }  
		 public static void main(String args[]){  
		  LocalInner1 obj=new LocalInner1();  
		  obj.display();  
		  
		  
		/*
		 * There are basically three advantages of inner classes in java. They are as
		 * follows:
		 * 
		 * 1) Nested classes represent a special type of relationship that is it can
		 * access all the members (data members and methods) of outer class including
		 * private.
		 * 
		 * 2) Nested classes are used to develop more readable and maintainable code
		 * because it logically group classes and interfaces in one place only.
		 * 
		 * 3) Code Optimization: It requires less code to write.
		 */

	}

}
