package Chocolate_Products;

/** Creating the tv sets class extending from the super class electronic device and implementing from the interface class taxable*/
@SuppressWarnings("serial")
public class TVSets extends EletronicDevice {

	//creating local attribute/variable
	private double displaySize;
	
	//creating constructor of the class
	public TVSets(String productId, String name, double price, int quantity, double displaySize) {
		super(productId, name, price, quantity);
		this.displaySize = displaySize;
	}//closing constructor
	
	//creating getters necessary to manipulate the class and its attributes
	@Override
	public String getMaterial() {
		return null;
	}//close getMaterial class
	@Override
	public double getDisplaySize() {
		return displaySize;
	}//closing get display size
	/** Overriding the product details method, in order to introduce the display size, specific of its class */
	@Override
	public void productDetails(String productId) {
		//creating local variable
		int eq = 0;
		int ct = 0;
		int dif = 0;
		//creating the display to print out the product details of the tv sets class
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type                   ProductId                Product Name                   Price                Display Size " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		
		System.out.println();
		System.out.println(" ================================================================================================================" );
		System.out.println();
		System.out.println(" ");

		System.out.println();
	}//details method
	/** Overriding the tax return method in order to calculate the specific tax for the tv set class*/
	@Override
	public double taxReturn(String productId, int quantity) {
		
		return quantity ;
	}//close taxReturn
}//Close TVset class
