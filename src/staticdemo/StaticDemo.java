package staticdemo;
// inner class -- best practice is to put in a diff file
// no class modifier makes it package private
class MyClass {
	// non static field and method
	public String message = "Hello World!";

	public void displayMessage() {
		System.out.println("Message = " + message);
	}

	// static field and static method
	public static String greetings = "Good morning!";

	public static void displayGreetings() {
		System.out.println("Greetings = " + greetings);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		MyClass sd = new MyClass();
		System.out.println(sd.message);
		
		MyClass.displayGreetings();
	}
}
