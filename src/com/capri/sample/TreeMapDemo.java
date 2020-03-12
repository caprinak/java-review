package com.capri.sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String args[]) {
		
		//Bạn nên chú ý rằng, không giống một hash map, một tree map 
		//bảo đảm rằng các phần tử của nó sẽ được xếp thứ tự theo thứ tự key tăng dần.
	      // Tao mot hash map
	      TreeMap tm = new TreeMap();
	      // Dat cac phan tu vao map
	      tm.put("Zara", new Double(3434.34));
	      tm.put("Mahnaz", new Double(123.22));
	      tm.put("Ayan", new Double(1378.00));
	      tm.put("Daisy", new Double(99.22));
	      tm.put("Qadir", new Double(-19.08));
	      
		  // Lay mot tap hop cac entry
	      Set set = tm.entrySet();
	      // Lay mot iterator
	      Iterator i = set.iterator();
	      // Hien thi cac phan tu
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      // Gui 1000 vao trong tai khoan cua Zara
	      double balance = ((Double)tm.get("Zara")).doubleValue();
	      tm.put("Zara", new Double(balance + 1000));
	      System.out.println("Balance hien tai cua Zara la: " +
	      tm.get("Zara"));
	      
	      System.out.println(tm.remove("Qadir"));
	     
	     
	      
	      
	   }
}
