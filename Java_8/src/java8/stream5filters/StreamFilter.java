package java8.stream5filters;

import java.util.*;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
			
		//Creating the stream of all names
		Stream<String> allNames = names.stream();
			
		//Creating another stream by filtering long names using filter()
		Stream<String> longNames = allNames.filter(str -> str.length() > 6);
			
		//displaying the long names
		longNames.forEach(str->System.out.print(str+" "));
	  }
}
