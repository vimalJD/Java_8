package java8.predicate.filter.chained.predicates;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java8.predicate6filter.model.EmployeeChainedPredicates;

/*

1. Predicate.and() ? Logical AND example

In given example, we have used Predicate.and() method which returns 
a composed predicate that represents a short-circuiting logical AND 
of this predicate and another.

    When evaluating the composed predicate, if first predicate 
    is false, then the other predicate is not evaluated.

Any exceptions thrown during evaluation of either predicate are '
relayed to the caller; if evaluation of first predicate throws 
an exception, the other predicate will not be evaluated.
 
*/


public class PredicateLogicalAndMethod {

	public static void main(String[] args) 
    {
        List<EmployeeChainedPredicates> employeesList = Arrays.asList(
                                            new EmployeeChainedPredicates(1, "Alex", 100),
                                            new EmployeeChainedPredicates(2, "Brian", 200),
                                            new EmployeeChainedPredicates(3, "Charles", 300),
                                            new EmployeeChainedPredicates(4, "David", 400),
                                            new EmployeeChainedPredicates(5, "Edward", 500),
                                            new EmployeeChainedPredicates(6, "Frank", 600)
                                        );
         
        Predicate<EmployeeChainedPredicates> idLessThan4 = e -> e.getId() < 4;
         
        Predicate<EmployeeChainedPredicates> salaryGreaterThan200 = e -> e.getSalary() > 200;
 
        List<EmployeeChainedPredicates> filteredEmployees = employeesList.stream()
                                .filter( idLessThan4.and( salaryGreaterThan200 ) )
                                .collect(Collectors.toList());
 
        System.out.println(filteredEmployees);
    }
	
}
