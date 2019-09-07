package chocolate_Products;



//creating the EletronicDevice class which inheritance of the abstract super class Product and implements the interface Taxable
@SuppressWarnings("serial")
public class EletronicDevice extends Product implements Taxable{
	
	//creating the constructor inheritate of the super class
	public EletronicDevice(String productId, String name, double price, int quantity) {
		super(productId, name, price, quantity);
	}//close constructor
	
	@Override
	public String getMaterial() {
		return null;
	}//close the get material method override
	@Override
	public int getMemorySize() {
		return 0;
	}//close the get Memory Size method override
	@Override
	public double getDisplaySize() {
		return 0;
	}//close the get Display Size method override
	@Override
	public Dimensions getDimensions() {
		return null;
	}//close the get Dimensions method override
	
	//creating the check Stoque which accept producId to print the message neceesary
	@Override
	public void checkStoque(String productId) {
		
				System.out.println(" ");
				System.out.println(" The productId - " + getProductId() + " - has a total of " + getQuantity() + " - "  + " in the Stoque. With the search -- " + productId + "." );
	}//close the check Stoque method override

	//Creating the product details method to verify and print out the message according with the user necessity
	@Override
	public void productDetails (String productId) {
		//creating local variable
		int eq = 0;
		int ct = 0;
		int dif = 0;
		//print out the display default of the super class eletronic device
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type                         ProductId                     Product Name                      Price                   		 " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		//Create the for loop to verify all the products in the arrayLIst
		for(int i = 0; i < Driver.products.size(); i++) {
			//if the productId inserted by the user is equal an any productId from this super class eletronic device
			if(Driver.products.get(i).getProductId().equals(productId)) {
				System.out.println(" Eletronic Device             " + Driver.products.get(i).getProductId() + "                     " +
						Driver.products.get(i).getName()  + "                 " + Driver.products.get(i).getPrice() + "                      "  );	
				eq += 1;
			//if the productId inserted by the user is not equal an any productId, but similar to the name from this super class eletronic device
			}else if (Driver.products.get(i).getProductId().contains(productId) && eq == 0) {
				System.out.println(" Eletronic Device             " + Driver.products.get(i).getProductId() + "                     " +
						Driver.products.get(i).getName()  + "                 " + Driver.products.get(i).getPrice() + "                      "  );	
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
		double p = 0;
		double q = quantity;
		double t = 0;
		
		//creating a for loop to verify all the array
		for(int m = 0; m < Driver.products.size(); m++) {
			//if statement to verify the correct productId to calculate the taxes
			if(Driver.products.get(m).getProductId().equals(pro)) {
				p = Driver.products.get(m).getPrice();
			}//close if statement
		 t = p * q * eletronictTax;
		}//close for loop
		return t;
	}//close tax Return method

}//close taxable class
