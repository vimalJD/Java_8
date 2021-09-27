package java8.predicate.filter.chained.predicates;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java8.predicate6filter.model.EmployeeChainedPredicates;

public class PredicateLogicalORMethod {

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
         
        Predicate<EmployeeChainedPredicates> idLessThan2 = e -> e.getId() < 2;
         
        Predicate<EmployeeChainedPredicates> salaryGreaterThan500 = e -> e.getSalary() > 500;
 
        List<EmployeeChainedPredicates> filteredEmployees = employeesList.stream()
                                .filter( idLessThan2.or( salaryGreaterThan500 ) )
                                .collect(Collectors.toList());
  
        System.out.println(filteredEmployees);
    }
}
