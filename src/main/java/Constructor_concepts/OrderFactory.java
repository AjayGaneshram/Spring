package Constructor_concepts;

public class OrderFactory {

	private String name;
	private String address;
	private int age;
	
	//public should change into private
	private OrderFactory(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// this getorder method is static method
	//once the bean created by getorder method
	//it will store in BeanFactory as cache
	//next time it will use the object.
	public static OrderFactory getOrder(String name,String address,int age) {
		System.out.println("Factory is called ----");
		return new OrderFactory(name, address, age);
		
	}
	
	public OrderFactory getInstanceOrder(String name,String address,int age) {
		System.out.println("InstanceFactory is called ----");
		return new OrderFactory(name, address, age);
	}
	@Override
	public String toString() {
		return "OrderFactory [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
}
