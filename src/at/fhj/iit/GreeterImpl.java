package at.fhj.iit;

public class GreeterImpl implements Greeter {
	
	private String name = "";
	
	

	public GreeterImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sayGoodbye() {
		
		System.out.println("Good Bye, " + this.name + "!");
		
	}

}
