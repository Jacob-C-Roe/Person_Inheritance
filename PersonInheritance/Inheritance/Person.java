
/*
 * Created by: Jacob Roe
 * Created On: 10/18/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/18/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A SuperClass to hold a persons name, address, and phone number
 */package Inheritance;

public class Person {

	//Set private fields
	private String name;
	private String address;
	private String phoneNumber;
	
	//Write one or more constructors for the person class
	Person(String newName, String newAddress, String newPhoneNumber){
		
		name = newName;
		address = newAddress;
		phoneNumber = newPhoneNumber;
		
	}
	
	//Mutator method for names
	public void setName(String Name) {
		
		this.name = Name;
		
	}
	
	//Mutator method for addresses
	public void setAddress(String Address) {
		
		this.address = Address;
		
	}
	
	//Mutator method for phone numbers
	public void setPhoneNumber(String PhoneNumber) {
		
		this.phoneNumber = PhoneNumber;
		
	}
	
	//Accessor method for names
	public String getName() {
		
		return this.name;
		
	}
	
	//Accessor method for addresses
	public String getAddress() {
		
		return this.address;
		
	}
	
	//Accessor method for phone numbers
	public String getPhoneNumber() {
		
		return this.phoneNumber;
		
	}
}
