package java8.functional3interfaces;

/*
In the following example,
a functional interface is extending to a non-functional interface.
*/

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now with default method from non-functional interface");  
    }  
}  
//@FunctionalInterface  
interface Sayable2 extends Doable{  
    void say(String msg);   // abstract method  
}  
public class FunctionalInterfaceExample3 implements Sayable2{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  
