package java8.functional3interfaces;

/* Describe the class
A functional interface can have methods of object class. See in the following example.
*/
          
    @FunctionalInterface  
    interface sayable1{  
        void say(String msg);   // abstract method  
        // It can contain any number of Object class methods.  
        int hashCode();  
        String toString();  
        boolean equals(Object obj);  
    }  
    public class FunctionalInterfaceExample2 implements sayable1{  
        public void say(String msg){  
            System.out.println(msg);  
        }  
        public static void main(String[] args) {  
            FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();  
            fie.say("Hello there");  
        }  
    }  