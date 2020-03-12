package io.capri.java8.function;

import java.util.function.Function;

public class JavaMoney {
	 public static void main(String[] args) {

	        Function<String, Integer> func = x -> x.length();

	        Integer apply = func.apply("mkyong");   // 6

	        System.out.println(apply);
	        
	        
	        Function<String, Integer> func1 = x -> x.length();

	        Function<Integer, Integer> func2 = x -> x * 2;

	        Integer result = func1.andThen(func2).apply("mkyong");   // 12

	        System.out.println(result);

	    }
}
