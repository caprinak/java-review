package io.capri.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExp {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		//lambda
		//Output : A,B,C,D,E
		list.forEach(item->System.out.print(item));
		System.out.println();	
		//Output : C
		list.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
		System.out.println();	
		//method reference
		//Output : A,B,C,D,E
		list.forEach(System.out::print);
		
		//Stream and filter
		//Output : B
		list.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}

}
