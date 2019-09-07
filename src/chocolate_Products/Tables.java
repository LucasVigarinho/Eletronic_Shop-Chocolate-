package chocolate_Products;



/** Creating the public class table extends from the super class the default attributes but not implementing taxable */
@SuppressWarnings("serial")
public class Tables extends Furniture{

	//crating constructor
	public Tables (String productId, String name, Double price, int quantity) {
		super(productId, name, price, quantity);
		
	}//closing constructor
}//Closing tables class
