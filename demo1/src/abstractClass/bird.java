package abstractClass;

public class bird extends animal {

	public bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("bird is eating");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("bird is breathing");
		getName();
	}
	public void fly() {
		System.out.println("bird flys");
	}

}
