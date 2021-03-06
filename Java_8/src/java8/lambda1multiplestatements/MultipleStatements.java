package java8.lambda1multiplestatements;

interface Sayable {
	public String say(String message);
}

public class MultipleStatements {

	public static void main(String[] args) {  
	      
        // You can pass multiple statements in lambda expression  
        Sayable person = (message)-> {  
            String str1 = "Hi Vimal, I would like to say, ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(person.say("If you want to learn something, you have to override absense of ____ with ATTITUDE"));  
    } 
}
