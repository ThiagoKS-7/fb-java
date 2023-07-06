package module1;

public class Dog {

	private String size;
	private String name;
	private String race;
	
	private String getSize(int sizeVal) {
		switch (sizeVal) {
			case 0:
				return "small";
			case 1: 
				return "medium";
			default:
				return "big";
		}
	}
	
	public Dog(int sizeVal, String name, String race) {
		
		this.size = this.getSize(sizeVal);
		this.name = name;
		this.race = race;
	}
	
	void bark() {
		System.out.println(
			"Woof Woof, i'm " + this.name + 
			", a " + 
			this.size + " " + 
			this.race + "!"
		);		
	}
}
