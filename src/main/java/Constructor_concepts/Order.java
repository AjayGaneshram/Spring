package Constructor_concepts;

import org.springframework.stereotype.Component;


public class Order {
	

 public String name;
public String address;
 public int id;
 
 //values are passed through the constructor..
public Order(String name, String address, int id) {
	System.out.println("First constructor");
	this.name = name;
	this.address = address;
	this.id = id;
}

public Order(String name, int id,String address) {
	System.out.println("Second constructor");
	this.name = name;
	this.address = address;
	this.id = id;
}
@Override
public String toString() {
	return "Order [name=" + name + ", address=" + address + ", id=" + id + "]";
}
 
 
}
