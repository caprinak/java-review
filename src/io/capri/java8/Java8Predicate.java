package io.capri.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
	
	public static void main(String[] args) {
		 Predicate<String> lengthIs3 = x -> x.length() == 3;
	        Predicate<String> startWithA = x -> x.startsWith("A");

	        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
	        //using or
	        List<String> collect = list.stream()
	                .filter(lengthIs3.or(startWithA))
	                .collect(Collectors.toList());

	        System.out.println(collect);
	        //using negate()
	        List<String> collect1 = list.stream()
	                .filter(startWithA.negate())
	                .collect(Collectors.toList());

	        System.out.println(collect1);
	        
	        System.out.println(StringProcessor.filter(
	                list, x -> x.startsWith("A")));                    // [A, AA, AAA]

	        System.out.println(StringProcessor.filter(
	                list, x -> x.startsWith("A") && x.length() == 3)); // [AAA]
	    
	        Predicate<String> startWithAMini = x -> x.startsWith("a");

	        // start with "a" or "m"
	        boolean result = startWithAMini.or(x -> x.startsWith("m")).test("mkyong");
	        System.out.println(result);     // true

	        // !(start with "a" and length is 3)
	        boolean result2 = startWithAMini.and(x -> x.length() == 3).negate().test("abc");
	        System.out.println(result2);    // false

	    
	}

}

class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }
    
}