package abstractClass;

public abstract class animal {
 
	private String name;
	public animal(String name) {
		this.name=name;
	}
	public abstract void eat();
	public abstract void breath();
	public String getName() {
		return name;
	}
	
	
}
