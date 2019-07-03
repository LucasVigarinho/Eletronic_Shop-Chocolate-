package Chocolate_Products;

/** creating the Dressers class extending from the super class furniture */
public class Dressers extends Furniture{

	private Dimensions dimensions;
	
	/** creating the constructor of the class Dressers, through the inheritance */
	public Dressers (String productId, String name, Double price, int quantity, int width, int depth, int height ) {
		super(productId, name, price, quantity);
		
		this.dimensions = new Dimensions( width,  depth,  height);
	}//closing the constructor 

	//creating the get dimensions getter
	public Dimensions getDimensions() {
		return dimensions;
	}//closing get dimensions 

	public double speak(double x) {
		return x;
		
	}
	/** Overriding the product details method, to print dimensions as well */
	@Override
	public void productDetails (String productId) {
		//creating the local variables
		
		System.out.println(" ================================================================================================================" );
		System.out.println();
		System.out.println(" ");
		System.out.println();
	}//details method
}//Closing dressers class
