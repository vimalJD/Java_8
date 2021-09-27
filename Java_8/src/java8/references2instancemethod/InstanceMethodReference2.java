package java8.references2instancemethod;

/*
In the following example, we are referring instance (non-static) method.
Runnable interface contains only one abstract method.
So, we can use it as functional interface.
*/	
	
	public class InstanceMethodReference2 {  
	    public void printnMsg(){  
	        System.out.println("Hello, this is instance method");  
	    }
	    
	    public static void main(String[] args) {  
	    Thread t2=new Thread(new InstanceMethodReference2()::printnMsg);  
	        t2.start();       
	    }  
	} 
	

