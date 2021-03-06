package java8.stream4api;

import java.util.*;
import java.util.stream.Collectors;

import java8.stream4api.model.Product;

/*
Java Stream Example: Filtering Collection by using Stream

Here, we are filtering data by using stream.
You can see that code is optimized and maintained.
Stream provides fast execution.
*/

public class FilteringCollectionUsingStream {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// Using Collectors's method to sum the prices.
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);

	}

}
