package java8.references2staticmethod;

interface Sayable{
	void say();
}

public class StaticMethod1 {

	public static void saySomething() {
		System.out.println("Hello, this is static meythod");
	}
	
	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = StaticMethod1::saySomething;
		// Calling interface method
		sayable.say();
	}
}