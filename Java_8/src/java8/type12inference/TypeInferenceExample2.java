package java8.type12inference;


	/*
	You can also create your own custom generic class and methods. 
	In the following example, we are creating our own generic class and method.
	Java Type Inference Example 2
*/
	    class GenericClass<X> {  
	          X name;  
	        public void setName(X name){  
	            this.name = name;  
	          }  
	        public X getName(){  
	            return name;  
	          }  
	        public String genericMethod(GenericClass<String> x){  
	            x.setName("John");  
	            return x.name;  
	          }  
	    }  
	      
	    public class TypeInferenceExample2 {  
	        public static void main(String[] args) {  
	            GenericClass<String> genericClass = new GenericClass<String>();  
	            genericClass.setName("Peter");  
	            System.out.println(genericClass.getName());  
	              
	            GenericClass<String> genericClass2 = new GenericClass<>();  
	            genericClass2.setName("peter");  
	            System.out.println(genericClass2.getName());  
	          
	            // New improved type inference  
	            System.out.println(genericClass2.genericMethod(new GenericClass<>()));  
	        }  
	    
}
