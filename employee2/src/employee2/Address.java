package employee2;

public class Address {
	private String city;
	private String country;
	private String state;
	private int pincode;
	public Address(String city, String country, String state, int pincode) {
		this.city = city;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	//public void setCountry(String country) {
		//this.country = country;
	//}
	public String getState() {
		return state;
	}
	//public void setState(String state) {
		//this.state = state;
//	}
	public int getPincode() {
		return pincode;
	}
	//public void setPincode(int pincode) {
		//this.pincode = pincode;
	//}
	

}
