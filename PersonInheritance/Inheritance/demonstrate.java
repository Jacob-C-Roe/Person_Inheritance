/*
 * Created by: Jacob Roe
 * Created On: 10/17/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/17/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A program to demonstrate an object of the Customer and PreferredCustomer Subclasses
 */
package Inheritance;

public class demonstrate {

	public static void main(String[] args) {
		
		//Create customer object
		Customer customer = new Customer(12345678, false);
		
		//Create preferred customer object
		PreferredCustomer prefcustomer = new PreferredCustomer(1600.99);
		
		//Display the objects
		display(customer, prefcustomer);
		
	}
	
	public static void display(Customer customer, PreferredCustomer prefcustomer) {
		//Title the customer object
		System.out.println("Customer:");
		
		//Print customer name
		System.out.println("Customer Name: " + customer.getName());
		
		//Print customer address
		System.out.println("Customer Address: " + customer.getAddress());
		
		//Print customer address
		System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
		
		//Print customer number
		System.out.println("Customer Number: " + customer.getCustomerNumber());
		
		//use getMailingLiusting to print out if the customer is on the mailing list or not
		boolean mail1 = customer.getMailingListing();
		if (mail1 == true) {
			
			System.out.println("Customer is on the mailing list");
			
		}
		else if (mail1 == false) {
			
			System.out.println("Customer is not on the mailing list");
			
		}
		
		//Print blank line
		System.out.println();
		
		//Title the preferred customer object
		System.out.println("Preferred Customer: ");
		
		//Print customer name
		System.out.println("Customer Name: " + prefcustomer.getName());
				
		//Print customer address
		System.out.println("Customer Address: " + prefcustomer.getAddress());
				
		//Print customer address
		System.out.println("Customer Phone Number: " + prefcustomer.getPhoneNumber());
				
		//Print customer number
		System.out.println("Customer Number: " + prefcustomer.getCustomerNumber());
				
		//use getMailingLiusting to print out if the customer is on the mailing list or not
		boolean mail2 = prefcustomer.getMailingListing();
		if (mail2 == true) {
					
			System.out.println("Customer is on the mailing list");
					
		}
		else if (mail2 == false) {
					
			System.out.println("Customer is not on the mailing list");
					
		}
		//Print amount spent
		System.out.println("Amount spent: " + prefcustomer.getAmount());
		
		//Print future discount
		System.out.println("Here is your future discount rate: " + prefcustomer.getDiscount() + "%");
		
	}
}
