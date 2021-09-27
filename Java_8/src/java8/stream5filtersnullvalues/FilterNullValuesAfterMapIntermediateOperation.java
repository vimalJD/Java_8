package java8.stream5filtersnullvalues;

import java.util.*;
import java.util.stream.Collectors;

public class FilterNullValuesAfterMapIntermediateOperation {

public static void main(String[] args) {

	List<Integer> list = Arrays.asList(1, 2, 3, null, 4, null, 5);
	List<Integer> result = list.stream()
		.map(num -> num) //here you will be having a different logic
		.filter(n -> n!=null)
		.collect(Collectors.toList());
	result.forEach(System.out::println);      

   }
}
