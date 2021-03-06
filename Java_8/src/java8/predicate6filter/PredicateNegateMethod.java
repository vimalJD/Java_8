package java8.predicate6filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 Java Predicate Negate Example

Predicate negate returns a predicate that represents the 
logical negation of the given predicate. 
The negate predicate returns all the elements 
from stream which were filtered out by original predicate.

1. Java predicate negate() method

The Predicate.negate() method returns the logical negation of existing predicate.
 */

public class PredicateNegateMethod {

	public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         
        Predicate<Integer> isEven = i -> i % 2 == 0;
         
        Predicate<Integer> isOdd = isEven.negate();
 
        List<Integer> evenNumbers = list.stream()
                    .filter(isEven)
                    .collect(Collectors.toList());
         
        List<Integer> oddNumbers = list.stream()
                .filter(isOdd)
                .collect(Collectors.toList());
         
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
