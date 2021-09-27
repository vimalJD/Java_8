package java8.stream5filters;

import java.util.*;
import java.util.stream.Collectors;

/*

Example 1: Stream filter() and collect()

We can create a stream and apply a filter 
in a one line as shown in the example below.
The collect() method here collects the final 
stream and converts it into a list
 */

public class FilterAndCollectMethod {

	public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longnames = names.stream()    // converting the list to stream
                .filter(str -> str.length() > 6)   // filter the stream to create a new stream
                .collect(Collectors.toList());  // collect the final stream and convert it to a List

        longnames.forEach(System.out::println);           

    }

}
