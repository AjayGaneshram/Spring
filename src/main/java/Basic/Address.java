package Basic;

public class Address {
  public String street;
  
  
	public Address() {
	System.out.println("Inside the Address Constructor");
}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		System.out.println("Inside the set method of Address "+street);
		this.street = street;
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside the print method of Address class");
		System.out.println(street);
		
	}

}
