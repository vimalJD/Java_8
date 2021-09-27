package java8.references2instancemethod;

/* comment
Reference to an Instance Method

like static methods,
you can refer instance methods also.
In the following example,
we are describing the process of referring the instance method.

Syntax
------
    containingObject::instanceMethodName      
*/

/*
Example 1
In the following example, 
we are referring non-static methods.
You can refer methods by class object and anonymous object
*/

interface Sayable{  
        void say();  
    }  
    public class InstanceMethodReference {  
        public void saySomething(){  
            System.out.println("Hello, this is non-static method.");  
        }  
        public static void main(String[] args) {  
            InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
            // Referring non-static method using reference  
                Sayable sayable = methodReference::saySomething;  
            // Calling interface method  
                sayable.say();  
                // Referring non-static method using anonymous object  
                Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
                // Calling interface method  
                sayable2.say();  
        }  
    }