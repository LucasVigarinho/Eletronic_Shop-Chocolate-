package chocolate_Products;


/** creating the Dressers class extends the attributes from the super class furniture */
@SuppressWarnings("serial")
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
	/** Overriding the product details method, in order to introduce the dimensions, specific of its class */
	@Override
	public void productDetails (String productId) {
		//creating the local variables
		int eq = 0;
		int ct = 0;
		int dif = 0;
		//create the default display of the product details
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type             ProductId             Product Name             Price       Dimensions (Height x Width x Depth) " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		//Create the for loop to verify all the products in the arrayLIst
		for(int i = 0; i < Driver.products.size(); i++) {
			//if the productId inserted by the user is equal an any productId from this class dresser
			if(Driver.products.get(i).getProductId().equals(productId)) {
				System.out.println(" Furniture        " + Driver.products.get(i).getProductId() + "             " +
						Driver.products.get(i).getName()  + "         " + Driver.products.get(i).getPrice() + "                    ("  +
						Driver.products.get(i).getDimensions().getHeight() + " x " + Driver.products.get(i).getDimensions().getWidth() + " x " +
						Driver.products.get(i).getDimensions().getDepth()+")");	
				eq += 1;
			//if the productId inserted by the user is not equal an any productId, but similar to the name from this class dresser
			}else if (Driver.products.get(i).getProductId().contains(productId) && eq == 0) {
				System.out.println(" Furniture        " + Driver.products.get(i).getProductId() + "             " +
						Driver.products.get(i).getName()  + "         " + Driver.products.get(i).getPrice() + "                    ("  +
						Driver.products.get(i).getDimensions().getHeight() + " x " + Driver.products.get(i).getDimensions().getWidth() + " x " +
						Driver.products.get(i).getDimensions().getDepth()+")");	
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
}//Closing dressers class
