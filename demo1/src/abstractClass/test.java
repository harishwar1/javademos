package abstractClass;

public class test {
	public static void main(String[] args) {
		animal a = new dog("puppy");
		a.breath();
		a.eat();
		a.getName();
		animal b =new bird("peacock");
		b.eat();
		b.breath();
		bird p =new parrot("parrot");
		p.fly();
	}

}
