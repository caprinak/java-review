package com.capri.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConceEx {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("user1", 6);
		scores.put("user2", 6);
		scores.put("user3", 6);
		scores.put("user4", 6);
		scores.put("user5", 6);
		scores.put("user6", 6);
		scores.put("user7", 6);
		
		Iterator<String> userItr = scores.keySet().iterator();
		
		
		//does not fail fast
		while(userItr.hasNext()) {
			System.out.println(scores.get(userItr.next()));
		}
		//weak reference : WeakHashMap
		
	}

}
