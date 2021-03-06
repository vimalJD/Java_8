package java8.stream5filtersnullvalues;

import java.util.*;
import java.util.stream.Collectors;

/*
 Java 8 Example: Filter null values from a stream

We can use lambda expression str -> str!=null
inside stream filter() to filter out null values from a stream.
 */

public class FilterNullValuesFromStream {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
		List<String> result = list.stream()
				.filter(str -> str!=null)
				.collect(Collectors.toList());
		result.forEach(System.out::println);      
		System.out.println();
		/*
		Alternatively you can use method reference Objects::nonNull
		in the filter() method to filter out the null values like this:
		*/
			List<String> result1 = list.stream()
					//.filter(Objects::nonNull)
					.filter(Objects::isNull)
					.collect(Collectors.toList());
			result1.forEach(System.out::println);
			
	   }
}
