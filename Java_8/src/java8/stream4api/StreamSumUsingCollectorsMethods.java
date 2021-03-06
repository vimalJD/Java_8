package java8.stream4api;
/*
Java Stream Example: Sum by using Collectors Methods

We can also use collectors to compute sum of numeric values.
In the following example, we are using Collectors class and
it's specified methods to compute sum of all the product prices.
*/
    import java.util.*;  
    import java.util.stream.Collectors;

import java8.stream4api.model.Product;  
      

public class StreamSumUsingCollectorsMethods {

	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
          
    }
	
}
