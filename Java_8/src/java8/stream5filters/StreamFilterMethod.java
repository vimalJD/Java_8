package java8.stream5filters;

import java.util.*;

import java8.stream4api.model.Product;

/*
A Simple Example of Java Stream Filter()

In this example we are creating a stream from 
the list of names using stream() method and 
then we are creating another stream of long names 
using stream filter(). As I mentioned above, 
the stream filter transforms the data of one stream into another stream.
*/

public class StreamFilterMethod {

	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        productsList.stream()  
                    .filter(p ->p.price> 30000)   // filtering price  
                    .map(pm ->pm.price)          // fetching price  
                    .forEach(System.out::println);  // iterating price  
    } 
}
