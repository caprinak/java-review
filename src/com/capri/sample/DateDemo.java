package com.capri.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	 public static void main(String args[]) {

	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      	//zzz	Time zone	Eastern Standard Time
	      System.out.println("Date hien tai: " + ft.format(dNow));
	      
	      // khoi tao mot doi tuong Date
	       Date date = new Date();
	        
	       // Hien thi date va time boi su dung toString()
	       System.out.printf("%1$s %2$tB %2$td, %2$tY", 
	                         "Date la:", date);
	       System.out.println();
	       
	       Date date1 = new Date();
	       System.out.printf("%s %tB %<te, %<tY", 
                   "Date la:", date1);
	       
	       
	       SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy-MM-dd"); 

	       String input = args.length == 0 ? "1818-11-11" : args[0]; 

	       System.out.print(input + " Duoc parse thanh dang "); 

	       Date t; 

	       try { 
	           t = ft1.parse(input); 
	           System.out.println(t); 
	       } catch (ParseException e) { 
	           System.out.println("Khong the parse duoc boi su dung " + ft1); 
	       }
	   }
}
