package ValueInjection;

public class Prices {

	public String name;
	public int value1;
	public Prices(String name, int value1) {
		
		this.name = name;
		this.value1 = value1;
	}
	public Prices() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
	
}
