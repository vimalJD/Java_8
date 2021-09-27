package java8.references2staticmethod;

import java.util.function.BiFunction;

class Arithmetic{  
	public static int add(int a, int b){  
		return a+b;  
		}  
	}

public class BiFunctionInterface {

	   
		public static void main(String[] args) {  
		BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
		int result = adder.apply(10, 20);  
		System.out.println(result);  
		}  
		
	
}
