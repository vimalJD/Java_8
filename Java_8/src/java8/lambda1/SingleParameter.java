package java8.lambda1;

interface Sayble{
	public String say(String name);
}

public class SingleParameter {
	
	public static void main(String[] args) {
		
		// Lambda expression with single parameter.
		Sayble s1 = (name)->{
			return "Hello, "+name;
		};
		System.out.println(s1.say("Vimal1"));
		
		// You can omit function parentheses
		Sayble s2 = name -> {
			return "Hello, "+name;
		};
		System.out.println(s2.say("Vimal2"));
	}
}
