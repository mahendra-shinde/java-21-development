package demo10;

import java.time.LocalDate;

public class Customer {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String phoneNumber;
	
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
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//Constructor name matches with classname
	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.birthDate = LocalDate.of(2000,1, 1);
		this.phoneNumber = "00000000";
	}
	
	
	public Customer(String firstName, String lastName, LocalDate birthDate, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
