package com.capri.sample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	 public static void main(String args[]) {
	      // tao mot hash set
	      HashSet hs = new HashSet();
	      // them cac phan tu toi hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      hs.add("F");
	      //them gia tri F 2 lan nhung ket qua chi xuat hien 1 lan
	      System.out.println(hs);
	      
	      // tao mot hash set
	      LinkedHashSet lhs = new LinkedHashSet();
	      // them cac phan tu toi hash set
	      lhs.add("B");
	      lhs.add("A");
	      lhs.add("D");
	      lhs.add("E");
	      lhs.add("C");
	      lhs.add("F");
	      System.out.println(lhs);
	      System.out.println(lhs.toArray()[1]);
	   }
}
