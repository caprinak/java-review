package com.capri.sample;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
	public static void main(String args[]) {
	      String months[] = {
	      "Jan", "Feb", "Mar", "Apr",
	      "May", "Jun", "Jul", "Aug",
	      "Sep", "Oct", "Nov", "Dec"};
	      
	      int year;
	      // Tao mot Gregorian calendar duoc khoi tao
	      // voi date va time hien tai trong
	      // locale va timezone mac dinh.
	      GregorianCalendar gcalendar = new GregorianCalendar();
	      // Hien thi thon tin date va time hien tai.
	      System.out.print("Date: ");
	      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
	      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
	      System.out.println(year = gcalendar.get(Calendar.YEAR));
	      System.out.print("Time: ");
	      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
	      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
	      System.out.println(gcalendar.get(Calendar.SECOND));
	      
	      // Kiem tra xem year hien tai co phai la leap year khong
	      if(gcalendar.isLeapYear(year)) {
	         System.out.println("Year hien tai la mot leap year");
	      }
	      else {
	         System.out.println("Year hien tai khong la mot leap year");
	      }
	   }
}
