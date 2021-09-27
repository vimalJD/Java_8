package java8.references2instancemethod;

import java.util.function.BiFunction;

/*
In the following example, we are using BiFunction interface.
It is a predefined interface and contains a functional method apply().
Here, we are referring add method to apply method.
*/

class Arithmetic3{  
	public int add(int a, int b){  
		return a+b;  
	}  
}  
public class InstanceMethodReference3 {  
	public static void main(String[] args) {  
		BiFunction<Integer, Integer, Integer>adder = new Arithmetic3()::add;  
		int result = adder.apply(10, 20);  
		System.out.println(result);  
}  
} 
