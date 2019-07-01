package Chocolate_Products;

/** creating the MP3Players class extending attributes from the super class Electronic device */
public class MP3Players extends EletronicDevice{

	//Creating the memory size attribute of it class
	private int memorySize;
	
	/** Creating the constructor of the class MP3Player, through the inheritance */
	public MP3Players(String productId, String name, double price, int quantity, int memorySize) {
		super(productId, name, price, quantity);
		this.memorySize = memorySize;
	}//closing constructor
	
	//Creating the getter of memory size
	public int getMemorySize() {
		return memorySize;
	}//closing get memory size

	
	/** Overriding the product details method, to print memory size specifications as well */
	@Override
	public void productDetails(String productId) {
		//Creating the local variables
		
		
		
		System.out.println();
		System.out.println("  =================================================================================== " );
		System.out.println();

		System.out.println();
	}//closing product details method
}//closing mp3 class
