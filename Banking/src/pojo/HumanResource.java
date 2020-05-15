package pojo;

public class HumanResource {
     private int securityKey;
     private String firstName;
     private String lastName;
     private Address Address;
     
	public HumanResource() {
		super();
	}
	public int getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(int securityKey) {
		this.securityKey = securityKey;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
     
     
}
