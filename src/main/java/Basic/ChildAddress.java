package Basic;

public class ChildAddress extends Address {

	public ChildAddress() {
		System.out.println("ChildAddress constructor");
	}
	@Override
	public void print() {
		System.out.println("print childAddress");
	}
}
