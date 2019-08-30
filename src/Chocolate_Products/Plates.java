package Chocolate_Products;


/** creating the Plates class extends the attributes from the super class Kitchenware */
@SuppressWarnings("serial")
public class Plates extends Kitchenware{

	/** creating the constructor of the class Plates, through the inheritance */
	public Plates(String productId, String name, double price, int quantity, String material) {
		super(productId, name, price, quantity, material);
	}//closing constructor
}//closing plates class
