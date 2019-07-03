package Chocolate_Products;

/** Creating the Furniture class, inheritance from the product abstract class */
public class Furniture extends Product {

	//Creating the constructor of the furniture class
	public Furniture(String productId, String name, double price, int quantity) {
		super(productId, name, price, quantity);
	}//close constructor

	//Override a check Stock to print the own informations
	@Override
	public void checkStoque(String productId) {
		System.out.println();
	}//Close checkStoque method
	
	/** Overrideing the product details method, in order to introduce the default display products details to the furniture */
	@Override
	public void productDetails(String productId) {
		//created local variables to manipulate the data
		
	}//details method
	
	//Overriding the tax Return method of the Furniture super class
	@Override
	public double taxReturn(String productId, int quantity) {
		double t = 0;
		return t;
	}//close taxReturn method
}//close Furniture class
