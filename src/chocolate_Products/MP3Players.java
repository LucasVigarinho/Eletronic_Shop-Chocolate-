package chocolate_Products;

/** creating the MP3Players class extends the attributes from the super class eletronic device */
@SuppressWarnings("serial")
public class MP3Players extends EletronicDevice{
	
	//crating the memory size attribute of it class
	public int memorySize;
	
	/** creating the constructor of the class MP3Players, through the inheritance */
	public MP3Players(String productId, String name, double price, int quantity, int memorySize) {
		super(productId, name, price, quantity);
		this.memorySize = memorySize;
	}//closing constructor 
	
	//creating the getter of the memory size
	public int getMemorySize() {
		return memorySize;
	}//closing get memory size

	/** Overriding the product details method, in order to introduce the memory size, specific of its class */
	@Override
	public void productDetails(String productId) {
		//creating the local variables
		int eq = 0;
		int ct = 0;
		int dif = 0;
		//create the default display of the product details
		System.out.println(" ");
		System.out.println(" ================================================================================================================" );
		System.out.println(" Type                   ProductId                Product Name                   Price                Memory Size " );
		System.out.println(" ================================================================================================================" );
		System.out.println(" ");
		//Create the for loop to verify all the products in the arrayLIst
		for(int i = 0; i < Driver.products.size(); i++) {
			//if the productId inserted by the user is equal an any productId from this class mp3Players
			if(Driver.products.get(i).getProductId().equals(productId)) {
				System.out.println(" Eletronic Device     " + Driver.products.get(i).getProductId() + "            " +
						Driver.products.get(i).getName()  + "              " + Driver.products.get(i).getPrice() + "                  " + 
						Driver.products.get(i).getMemorySize()  );	
				eq += 1;
			//if the productId inserted by the user is not equal an any productId, but similar to the name from this mp3 class
			}else if (Driver.products.get(i).getProductId().contains(productId) && eq == 0) {
				System.out.println(" Eletronic Device       " + Driver.products.get(i).getProductId() + "            " +
						Driver.products.get(i).getName()  + "              " + Driver.products.get(i).getPrice() + "                  " + 
						Driver.products.get(i).getMemorySize()  );	
				ct += 1;
			}//close if statement
		}//close for loop
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
	}//closing product details method
}//closing mp3 class
