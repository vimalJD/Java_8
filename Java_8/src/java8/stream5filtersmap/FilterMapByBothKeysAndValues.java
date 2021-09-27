package java8.stream5filtersmap;

import java.util.*;
import java.util.stream.Collectors;

/*
 Java 8 � Filter Map by both Keys and Values

In this example we are filtering a Map by keys and values both.
When we filter a Map like this we are joining both the conditions
by AND (&&) logical operator. You can also place both
the conditions in the single filter() method and join
them using any logical operator such as OR (||), AND(&&) or NOT(!). 
 */

public class FilterMapByBothKeysAndValues {

	public static void main(String[] args) {
	      Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "ABC");
	      hmap.put(2, "XCB");
	      hmap.put(3, "ABB");
	      hmap.put(4, "ZIO");

	      Map<Integer, String> result = hmap.entrySet()
	         .stream()
	         .filter(p -> p.getKey().intValue() <= 2) //filter by key
	         .filter(map -> map.getValue().startsWith("A")) //filter by value
	         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	     System.out.println("Result: " + result);
	   }
}
