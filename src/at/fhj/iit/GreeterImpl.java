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
		// TODO Auto-generated method stub

	}

}
