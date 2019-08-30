package Chocolate_Products;



/** creating the Forks class extends the attributes from the super class Kitchenware */
@SuppressWarnings("serial")
public class Forks extends Kitchenware{

	/** creating the constructor of the class Forks, through the inheritance */
	public Forks(String productId, String name, double price, int quantity, String material) {
		super(productId, name, price, quantity, material);
	}//closing constructor
}//closing class kitchenware
