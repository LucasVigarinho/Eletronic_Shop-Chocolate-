package Chocolate_Products;



/**
 * @author Lucas_Vigarinho
 *
 */
/** 
 * 	Each product should have ---  product ID,
 * 							 ---  name
 * 							 ---  price
 * 							 ---  and quantity parameters. 
 * 
 * */ 

//create the abstract super class 
abstract class Product {

	//create the default attributes 
	private String productId;
	private String name;
	private double price;
	private int quantity;
	
	//create the constructor
	public Product(String productId, String name, double price, int quantity) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}//close constructor
	
	//creating the getters and setter necessary for the exercise
	public String getProductId() {
		return productId;
	}//closing get Product Id
	public void setProductId(String productId) {
		this.productId = productId;
	}//closing set Product Id
	public String getName() {
		return name;
	}//closing get Name
	public void setName(String name) {
		this.name = name;
	}//closing set Name
	public double getPrice() {
		return price;
	}//closing get Price
	public void setPrice(double price) {
		this.price = price;
	}//closing set Price
	public int getQuantity() {
		return quantity;
	}//closing get Quantitu
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}//closing set Quantity

	//creating the buy products method to be used through the inheritance
	public void buyProducts(String productId, int quantity) {
		int p = getQuantity() - quantity;
		setQuantity(p);
		System.out.println("                                                                                     ");
		System.out.println(" =================================================================================== ");
		System.out.println(" Congratulation! You succesfully bought " + quantity + " of " + productId);
		System.out.println(" =================================================================================== ");
		System.out.println("                                                                                     ");
		
	}//closing the buy products method
	
	//creating the buy products method to be used through the inheritance
	public void restock(String productId, int quantity) {
		int p = getQuantity() + quantity;
		setQuantity(p);
		System.out.println("                                                                                     ");
		System.out.println(" =================================================================================== ");
		System.out.println(" Congratulation! You succesfully restoque " + quantity + " of " + productId);
		System.out.println(" =================================================================================== ");
		System.out.println(" Now we have " + getQuantity() + " of the product " + productId + " in stock.");
		System.out.println("                                                                                     ");
				
	}//closing the buy products method		

	public void checkStoque(String productId) {
		// TODO Auto-generated method stub
		
	}

	public void productDetails(String productId) {
		// TODO Auto-generated method stub
		
	}

	public double taxReturn(String productId, int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

}//Closing class Product
