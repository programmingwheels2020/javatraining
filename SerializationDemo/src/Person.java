import java.io.Serializable;

public class Person implements Serializable{

	String name;
	transient int age;
	String location;
	Address address;

	public Person(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
