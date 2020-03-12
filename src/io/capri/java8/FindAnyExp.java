package io.capri.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAnyExp {
	 public static void main(String[] args) {

	        List<Person> persons = Arrays.asList(
	                new Person("mkyong", 30),
	                new Person("jack", 20),
	                new Person("lawrence", 40)
	        );

	        Person result1 = persons.stream()                        // Convert to steam
	                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
	                .findAny()                                      // If 'findAny' then return found
	                .orElse(null);                                  // If not found, return null

	        System.out.println("jack is " + result1.getAge()+ " years old");
	        
	        Person result2 = persons.stream()
	                .filter(x -> "ahmook".equals(x.getName()))
	                .findAny()
	                .orElse(null);

	        System.out.println(result2);
	        
	        
	        String name = persons.stream()
	                .filter(x -> "jack".equals(x.getName()))
	                .map(Person::getName)                        //convert stream to String
	                .findAny()
	                .orElse("");

	        System.out.println("name : " + name);

	        List<String> collect = persons.stream()
	                .map(Person::getName)
	                .collect(Collectors.toList());

	        collect.forEach(System.out::println);

	    }
}
