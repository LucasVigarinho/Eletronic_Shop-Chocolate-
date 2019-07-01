package Chocolate_Products;

/** Creating the mobile phone class extends attributes from the super class electronic Devices*/
public class MobilePhones extends EletronicDevice {

	/** creating the constructor of the class mobile phones, through the inheritance */
	public MobilePhones (String productId, String name, double price, int quantity)  {
		super(productId, name, price, quantity);
	}//closing constructor
}//closing the mobile class
