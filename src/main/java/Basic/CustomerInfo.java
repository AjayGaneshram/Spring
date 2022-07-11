package Basic;

public class CustomerInfo {

	public String Name;
	
	
	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		System.out.println("Inside the SetName method "+name);
		Name = name;
	}



	public CustomerInfo() {
		System.out.println("Inside the CustomerInfo Constructor");
	}



	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside the print method of CustomerInfo class");
		System.out.println(Name);
	}

}
