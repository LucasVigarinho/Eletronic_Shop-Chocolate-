package chocolate_Products;

/**
 * @author Lucas_Vigarinho_HDC_OOD_2989295_Week_6_FILE_HANDLING
 *
 */

/** creating the chairs class extends the attributes from the super class furniture */
@SuppressWarnings("serial")
public class Chairs extends Furniture{
	/** creating the constructor of the class Chairs, through the inheritance */
	public Chairs (String productId, String name, Double price, int quantity) {
		super(productId, name, price, quantity);
	}//closing constructor 

}//Closing chairs class
