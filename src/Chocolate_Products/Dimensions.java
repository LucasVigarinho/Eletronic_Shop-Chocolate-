package Chocolate_Products;

/** creating the dimensions class as a variable for the class Dresser */
public class Dimensions {

	//Creating the attributes of the class
	private int width;
	private int depth;
	private int height;
	
	
	//creating the constructor with the measures
	public Dimensions(int width, int depth, int height) {
		this.width = width;
		this.depth = depth;
		this.height = height;
		
	}//closing constructor

	//creating the getters necessary to extract the variables
	public int getWidth() {
		return width;
	}//closing get width
	public int getDepth() {
		return depth;
	}//closing get depth
	public int getHeight() {
		return height;
	}//closing get height
	
}//closing the dimensions class
