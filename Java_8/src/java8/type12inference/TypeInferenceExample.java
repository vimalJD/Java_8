package java8.type12inference;

import java.util.*;

/*
 Java Type Inference

Type inference is a feature of Java which provides ability 
to compiler to look at each method invocation and corresponding 
declaration to determine the type of arguments.

Java provides improved version of type inference in Java 8. 
the following example explains, how we can use type inference in our code:

Here, we are creating arraylist by mentioning integer 
type explicitly at both side. The following approach is used 
earlier versions of Java.

 */

public class TypeInferenceExample {

	public static void showList(List<Integer>list){  
        if(!list.isEmpty()){  
            list.forEach(System.out::println);  
        }else System.out.println("list is empty");  
    }  
    public static void main(String[] args) {  
        // An old approach(prior to Java 7) to create a list  
        List<Integer> list1 = new ArrayList<Integer>();  
        list1.add(11);  
        showList(list1);  
        // Java 7    
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type  
        list2.add(12);  
        showList(list2);  
        // Compiler infers type of ArrayList, in Java 8  
        showList(new ArrayList<>());  
    }
}
