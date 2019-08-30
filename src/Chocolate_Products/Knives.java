package Chocolate_Products;



/** creating the Knives class extends the attributes from the super class Kitchenware */
@SuppressWarnings("serial")
public class Knives extends Kitchenware{

	/** creating the constructor of the class Knives, through the inheritance */
	public Knives(String productId, String name, double price, int quantity, String material) {
		super(productId, name, price, quantity, material);
	}//close constructor

}//closing class knives
