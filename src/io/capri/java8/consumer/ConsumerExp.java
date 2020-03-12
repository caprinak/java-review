package io.capri.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExp {
	 public static void main(String[] args) {

	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

	        // implementation of the Consumer's accept methods.
	        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
	        forEach(list, consumer);

	        // or call this directly
	        forEach(list, (Integer x) -> System.out.println(x));
	        
	        List<String> list1 = Arrays.asList("a", "ab", "abc");
	        forEach(list1, (String x) -> System.out.println(x.length()));

	    }

	   

	    static <T> void forEach(List<T> list, Consumer<T> consumer) {
	        for (T t : list) {
	            consumer.accept(t);
	        }
	    }

}
