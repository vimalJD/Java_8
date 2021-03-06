package java8.stream5filters;

import java.util.*;
import java.util.stream.Collectors;

/*
Example 2: Stream filter() with multiple conditions

In the above examples we have seen that there is only
one condition in the filter() method. We can have more
than one conditions in the filter() method joined using
the logical operators in java. In the following example,
we have two conditions in the filter method joined using and (&&) logical operator.
*/

public class FilterMethodWithMultipleConditions {

	public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longnames = names.stream()  
                .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
                .collect(Collectors.toList());  

        longnames.forEach(System.out::println);           

    }
	
}
