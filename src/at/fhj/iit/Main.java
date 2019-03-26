package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		Greeter g = new GreeterImpl("Thomas Urlacher");
		
		g.sayHello();
		g.sayGoodbye();

	}

}
