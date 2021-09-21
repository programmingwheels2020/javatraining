import java.io.Serializable;

public class Address implements Serializable{

	String pincode;
	String district;
	String state;

	public Address(String pincode, String district, String state) {
		super();
		this.pincode = pincode;
		this.district = district;
		this.state = state;
	}

}
