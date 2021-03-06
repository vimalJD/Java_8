package java8.stream5filters;

import java.util.*;
import java.util.stream.Collectors;

public class FilterAndMap {

	public static void main(String[] args) {

    	List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
        		.map(n -> n * n)
        		.collect(Collectors.toList());
        System.out.println(squares);        

    }
}
