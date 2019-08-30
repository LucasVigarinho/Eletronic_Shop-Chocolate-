package Chocolate_Products;

/**
 * @author Lucas_Vigarinho_HDC_OOD_2989295_Week_6_FILE_HANDLING
 *
 */

//creating the Kitchenware class which inheritance of the abstract super class Product and implements the interface Taxable
@SuppressWarnings("serial")
public class Kitchenware extends Product implements Taxable{
	//creating the local variable/attribnute material
	public String material;

	//creating the constructor
	public Kitchenware (String productId, String name, double price, int quantity, String material) {
		super(productId, name, price, quantity);
		this.material = material;
	}//close constructor
	
	//Creating the getters necessary to manipulate the data inside the class if needs
	public String getMaterial() {
		return material;
	}//Closing getMaterial method
	@Override
	public int getMemorySize() {
		return 0;
	}//Closing get Memory Size method
	@Override
	public double getDisplaySize() {
		return 0;
	}//Closing Display Size method
	@Override
	public Dimensions getDimensions() {
		return null;
	}//Closing get Dimenions method
	
	//Creating the check stoque Overirde Method
	@Override
	public void checkStoque(String productId) {
			
			//Printing the necessary message to the sotque checked
			System.out.println(" ");
			System.out.println(" The productId - " + getProductId() + " - has a total of " + 
							getQuantity() + " - "  + " in the Stoque. With the search -- " + productId + "." );

	}//Closing getMaterial method
	
	//Creating the product details display method default to the kitchenware
	@Override
	public void productDetails(String productId) {
		//creating the local variables
		int eq = 0;
		int ct = 0;
		int dif = 0;
		//printing out the display of this super class
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type                   ProductId                Product Name                   Price                   Material " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		//Create the for loop to verify all the products in the arrayLIst
		for(int i = 0; i < Driver.products.size(); i++) {
			//if the productId inserted by the user is equal an any productId from this super class Kitchenware
			if(Driver.products.get(i).getProductId().equals(productId)) {
				System.out.println(" Kitchenware             " + Driver.products.get(i).getProductId() + "                 " +
						Driver.products.get(i).getName()  + "                 " + Driver.products.get(i).getPrice() + "                      " + 
						Driver.products.get(i).getMaterial()  );	
				eq += 1;
			//if the productId inserted by the user is not equal an any productId, but similar to the name from this super class Kitchenware
			}else if (Driver.products.get(i).getProductId().contains(productId) && eq == 0) {
				System.out.println(" Kitchenware             " + Driver.products.get(i).getProductId() + "                 " +
						Driver.products.get(i).getName()  + "                 " + Driver.products.get(i).getPrice() + "                      " + 
						Driver.products.get(i).getMaterial()  );	
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
		
	//creating the tax return method to utilize the implemented taxable 
	@Override
	public double taxReturn(String productId, int quantity) {
		//Creating the local variable
		String pro = productId;
		double q = quantity;
		double t = 0;
		
		//creating a for loop to verify all the array
		for(int m = 0; m < Driver.products.size(); m++) {
			//if statement to manipulate the differences of taxes for product which the material were plastic
			if(Driver.products.get(m).getProductId().equals(pro)) {
				if(Driver.products.get(m).getMaterial().equals("Plastic")) {
					t = Driver.products.get(m).getPrice() * q * addTax;
				}else {
					t = Driver.products.get(m).getPrice() * q * defaultTax;
				}//close if statement nested
			}//close if statement
		}//close for loop
		return t;
	}//close method Tax return
}//close Taxable class

		
	


