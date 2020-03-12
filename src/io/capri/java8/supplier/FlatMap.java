package io.capri.java8.supplier;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);
        //empty output
        
        
        String[][] data1 = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp1 = Arrays.stream(data1);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp1.flatMap(x -> Arrays.stream(x));

        Stream<String> stream1 = stringStream.filter(x -> "a".equals(x.toString()));

        stream1.forEach(System.out::println);

		/*Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));*/
    }
}
