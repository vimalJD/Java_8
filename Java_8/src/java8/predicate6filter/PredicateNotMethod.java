package java8.predicate6filter;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
2. Java predicate not() method

In Java 11, Predicate class has new method not(). 
It returns a predicate that is the negation of the 
supplied predicate. This is accomplished by returning 
result of the calling predicate.negate().
 */
public class PredicateNotMethod {

	public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         
        Predicate<Integer> isEven = i -> i % 2 == 0;
         
        Predicate<Integer> isOdd = Predicate.not( isEven );
 
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
