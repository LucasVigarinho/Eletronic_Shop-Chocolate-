package chocolate_Products;


//creating the Furniture class which inheritance of the abstract super class Product and no implements the interface Taxable
@SuppressWarnings("serial")
public class Furniture extends Product {

	//Creating the constructor of the furniture class
	public Furniture (String productId, String name, Double price, int quantity) {
		super(productId, name, price, quantity);
	}//close constructor 
	
	//Override the getters necessary to manipulate the necessary data from the class
	@Override
	public String getMaterial() {
		return null;
	}//close get Material method Override
	
	@Override
	public int getMemorySize() {
		return 0;
	}//close get Memory Size method Override
	@Override
	public double getDisplaySize() {
		return 0;
	}//close get Display Size method Override
	@Override
	public Dimensions getDimensions() {
		return null;
	}//close get Dimensions method Override
	

	@Override
	public void checkStoque(String productId) {
			System.out.println(" ");
			System.out.println(" The productId - " + getProductId() + " - has a total of " + getQuantity() + " - "  + " in the Stoque. With the search -- " + productId + "." );
	}//Close checkStoque method
	/** Overriding the product details method, in order to introduce the default display products details to the furniture extends */
	@Override
	public void productDetails (String productId) {
		//created local variables to manipulate the data 
		int eq = 0;
		int ct = 0;
		int dif = 0;
		//create the default display of the product details
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type                         ProductId                     Product Name                      Price                   		 " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		//Create the for loop to verify all the products in the arrayLIst
		for(int i = 0; i < Driver.products.size(); i++) {
			//if the productId inserted by the user is equal an any productId from this super class Furniture
			if(Driver.products.get(i).getProductId().equalsIgnoreCase(productId)) {
				System.out.println(" Furniture                     " + Driver.products.get(i).getProductId() + "                      " +
						Driver.products.get(i).getName()  + "                   " + Driver.products.get(i).getPrice() + "                      "  );	
				eq += 1;
			//if the productId inserted by the user is not equal an any productId, but similar to the name from this super class Furniture
			}else if (Driver.products.get(i).getProductId().contains(productId) && eq == 0) {
				System.out.println(" Furniture                     " + Driver.products.get(i).getProductId() + "                      " +
						Driver.products.get(i).getName()  + "                   " + Driver.products.get(i).getPrice() + "                      "  );	
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

	//Overriding the tax Return method of the Furniture super class
	@Override
	public double taxReturn(String productId, int quantity) {
		double t = 0;
		return t;
	}//close taxReturn method
}//close Furniture class

