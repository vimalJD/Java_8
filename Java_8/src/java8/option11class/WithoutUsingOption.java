package java8.option11class;

/*
 Java Optional Class

Java introduced a new class Optional in jdk8. 
It is a public final class and used to deal with 
NullPointerException in Java application. 
You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable.
 */

public class WithoutUsingOption {

	  
	    public static void main(String[] args) {  
	        String[] str = new String[10];  
	        String lowercaseString = str[5].toLowerCase();  
	        System.out.print(lowercaseString);  
	 
	        //To avoid the abnormal termination, we use Optional class.
	}
}
