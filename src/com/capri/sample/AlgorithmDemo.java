package com.capri.sample;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmDemo {
	 public static void main(String args[]) {
	      // Tao va khoi tao linked list
	      LinkedList<Integer> ll = new LinkedList();
	      ll.add(new Integer(-8));
	      ll.add(new Integer(20));
	      ll.add(new Integer(-20));
	      ll.add(new Integer(8));
	      
	      // Ta mot comparator voi thu tu dao nguoc
	      Comparator r = Collections.reverseOrder();
	      // Sap xep list boi su dung comparator
	      Collections.sort(ll, r);
	      // Lay iterator
	      Iterator li = ll.iterator();
	      System.out.print("List duoc sap xep theo thu tu dao nguoc la: ");
	      while(li.hasNext()){
	         System.out.print(li.next() + " ");
	      }
	      System.out.println();
	      Collections.shuffle(ll);
	      // Hien thi danh sach sap xep ngau nhien
	      li = ll.iterator();
	      System.out.print("List sau khi bi xao tron la: ");
	      while(li.hasNext()){
	         System.out.print(li.next() + " ");
	      }
	      System.out.println();
	      System.out.println("Minimum: " + Collections.min(ll));
	      System.out.println("Maximum: " + Collections.max(ll));
	   }
}
