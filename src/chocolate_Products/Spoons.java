package chocolate_Products;



/** creating the spoons class extends the attributes from the super class Kitchenware */
@SuppressWarnings("serial")
public class Spoons extends Kitchenware{

	/** creating the constructor of the class spoons, through the inheritance */
	public Spoons (String productId, String name, double price, int quantity, String material) {
		super(productId, name, price, quantity, material);
	}//closing constructor	
}//closing class spoons
