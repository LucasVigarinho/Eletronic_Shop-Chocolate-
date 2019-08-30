package Chocolate_Products;

/** Creating the tv sets class extending from the super class electronic device and implementing from the interface class taxable*/
@SuppressWarnings("serial")
public class TVSets extends EletronicDevice implements Taxable{

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
		//Create the for loop to verify all the products in the arrayLIst
		for(int i = 0; i < Driver.products.size(); i++) {
			//if the productId inserted by the user is equal an any productId from this class tv sets
			if(Driver.products.get(i).getProductId().equals(productId)) {
				System.out.println(" Eletronic Device     " + Driver.products.get(i).getProductId() + "                      " +
						Driver.products.get(i).getName()  + "                       " + Driver.products.get(i).getPrice() + "                         " + 
						Driver.products.get(i).getDisplaySize()  );	
				eq += 1;
			//if the productId inserted by the user is not equal an any productId, but similar to the name from this class tv sets
			}else if (Driver.products.get(i).getProductId().contains(productId) && eq == 0) {
				System.out.println(" Eletronic Device       " + Driver.products.get(i).getProductId() + "                   " +
						Driver.products.get(i).getName()  + "                       " + Driver.products.get(i).getPrice() + "                      " + 
						Driver.products.get(i).getDisplaySize()  );	
				ct += 1;
			}//close if statement
		}//close for loop
		//if the productId inserted by the user was not found in the stoque
		for(int i = 0; i < Driver.products.size(); i++) {
			if (eq == 0 && ct == 0 && dif == 0 ){
				System.out.println(" The search " + productId + " was not found in our Stoque. Try changing the productId name. ");
				dif += 1;
			}//close if statement
		}//close for loop
		System.out.println();
		System.out.println(" ================================================================================================================" );
		System.out.println();
		System.out.println(" ");

		System.out.println();
	}//details method
	/** Overriding the tax return method in order to calculate the specific tax for the tv set class*/
	@Override
	public double taxReturn(String productId, int quantity) {
		String pro = productId;
		double p = 0;
		double q = quantity;
		double t = 0;
		
		//for loop to verify all the array
		for(int m = 0; m < Driver.products.size(); m++) {
			if(Driver.products.get(m).getProductId().equals(pro)) {
				p = Driver.products.get(m).getPrice();
			}
		 t = p * q * tvTax; //using the specific tax for this group of product 
		
		}//close for loop
		return t;
	}//close taxReturn
}//Close TVset class
