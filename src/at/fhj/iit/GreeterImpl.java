package at.fhj.iit;

public class GreeterImpl implements Greeter {
	
	private String name = "";
	
	

	public GreeterImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello, " +this.name);
	}

	@Override
	public void sayGoodbye() {
		
<<<<<<< HEAD
		System.out.println("Good Bye, " + this.name + "! Denis");
=======
		System.out.println("Good Bye, " + this.name);
>>>>>>> ea2f51fe41fe230a402fac56266bf343df414298
		
	}

}
