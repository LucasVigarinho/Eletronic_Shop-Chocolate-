package Chocolate_Products;


import java.io.Serializable;

/** creating the dimensions class to be the base of the another class (dresser) */
@SuppressWarnings("serial")
public class Dimensions implements Serializable {
	
		//creating the attibutes of the class
		private int width;
		private int depth;
		private int height;

	//creating the constructor with the three mesures
	public Dimensions (int width, int depth, int height) {
		
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
	}//closign get depth
	public int getHeight() {
		return height;
	}//closing get height

	

}//closing the dimensions class
