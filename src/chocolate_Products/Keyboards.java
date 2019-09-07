package chocolate_Products;



/** creating the KnivKeyboardes class extends the attributes from the super class eletronic devices */
@SuppressWarnings("serial")
public class Keyboards extends EletronicDevice{

	/** creating the constructor of the class Keyboard, through the inheritance */
	public Keyboards(String productId, String name, double price, int quantity) {
		super(productId, name, price, quantity);
	}//closing the constructor class
}//closing the keyboard class
