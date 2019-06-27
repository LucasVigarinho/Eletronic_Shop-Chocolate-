package Chocolate_Products;


//creating the EletronicDevice class which inheritance of the abstract super class Product and implements the interface Taxable???
@SuppressWarnings("serial")
public class EletronicDevice extends Product {
	
	//creating the constructor inheritate of the super class
	public EletronicDevice(String productId, String name, double price, int quantity) {
		super(productId, name, price, quantity);
	}//close constructor
	
	
	//creating the check Stoque which accept producId to print the message neceesary
	@Override
	public void checkStoque(String productId) {
		
				System.out.println(" ");
				System.out.println(" The productId - " + getProductId() + " - has a total of " + getQuantity() + " - "  + " in the Stoque. With the search -- " + productId + "." );
	}//close the check Stoque method override

	//Creating the product details method to verify and print out the message according with the user necessity
	@Override
	public void productDetails (String productId) {

		//print out the display default of the super class eletronic device
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type                         ProductId                     Product Name                      Price                   		 " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		
		
		
		System.out.println();
		System.out.println(" ================================================================================================================" );
		System.out.println();
		System.out.println(" ");

		System.out.println();
	}//details method
	
	//creating the tax return method to utilize the implemented taxable 
	@Override
	public double taxReturn(String productId, int quantity) {
		return quantity;
		//Creating the local variable
		

	}


	public String getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}


	public double getDisplaySize() {
		// TODO Auto-generated method stub
		return 0;
	}//close taxable class
}