package chocolate_Products;


/** creating the mobile phone class extends the attributes from the super class eletronic devices */
@SuppressWarnings("serial")
public class MobilePhones extends EletronicDevice {

	/** creating the constructor of the class mobile phones, through the inheritance */
	public MobilePhones(String productId, String name, double price, int quantity) {
		super(productId, name, price, quantity);

	}//closing constructor 

}//closing the mobile class
