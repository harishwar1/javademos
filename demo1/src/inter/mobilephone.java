package inter;

public class mobilephone implements Telephone {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("turn on phone");
	}

	@Override
	public void dail() {
		// TODO Auto-generated method stub
		System.out.println("dailing");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println("answered from mobile");
		
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
