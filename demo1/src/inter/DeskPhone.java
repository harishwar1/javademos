package inter;

public class DeskPhone implements Telephone{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("always on");
		
	}

	@Override
	public void dail() {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println("answered from desk");
		
	}

	@Override
	public boolean callphone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean callRinging() {
		// TODO Auto-generated method stub
		return false;
	}

}
