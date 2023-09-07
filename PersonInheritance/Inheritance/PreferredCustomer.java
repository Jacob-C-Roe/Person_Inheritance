/*
 * Created by: Jacob Roe
 * Created On: 10/17/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/17/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A Subclass which inherits the Customer class and contain fields for the amount of the customer's purchases
 * and the appropriate discount level
 */
package Inheritance;

public class PreferredCustomer extends Customer {

	//Create data fields
	private double amount;
	private double discount;
	
	//Constructor for PreferredCustomer
	PreferredCustomer(double newAmount){
		
		//invoke superclass constructor Customer
		super(12345678, false);
		
		amount = newAmount;
		
		//If else loop to set the discount based off of the amount
		if(amount >= 500.00 && amount < 1000.00) {
			
			discount = 5;

		}
		
		else if(amount >= 1000.00 && amount < 1500.00 ) {
			
			discount = 6;
	
		}
		else if(amount >= 1500.00 && amount < 2000.00 ) {
			
			discount = 7;

		}
		else if(amount > 2000.00) {
			
			discount = 10;
			
		}
		
	}
	
	//Mutator method for amount
	public void setAmount(int Amount) {
				
		this.amount = Amount;
				
	}
			
	//Mutator method for discount
	public void setDiscount(int Discount) {
				
		this.discount = Discount;
		
	}
			
	//Accessor method for amount
	public double getAmount() {
				
		return this.amount;
				
	}
			
	//Accessor method for discount
	public double getDiscount() {
				
		return this.discount;
				
	}
}
