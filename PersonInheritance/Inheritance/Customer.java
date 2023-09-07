/*
 * Created by: Jacob Roe
 * Created On: 10/17/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/17/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A Subclass which inherits from the Person class that includes a customer number and boolean field indicating
 * Whether the customer wishes to be on a mailing list
 */
package Inheritance;

public class Customer extends Person {

	// Set private fields
	private int customerNumber;
	private boolean mailingList;
	
	//Write one or more constructors
	Customer(int newCustomerNumber, boolean newMailingList){
		
		//invoke superclass constructor Person
		super("Joe", "429 Vanity Ave.", "5176071234");				
		
		customerNumber = newCustomerNumber;
		mailingList = newMailingList;
		
	}
	
	//Mutator method for customer number
	public void setCustomerNumber(int CustomerNumber) {
			
		this.customerNumber = CustomerNumber;
			
	}
		
	//Mutator method for mailing list
	public void setMailingList(boolean MailingList) {
			
		this.mailingList = MailingList;
			
	}
		
	//Accessor method for customer number
	public int getCustomerNumber() {
			
		return this.customerNumber;
			
	}
		
	//Accessor method for mailing list
	public boolean getMailingListing() {
			
		return this.mailingList;
			
	}
}
