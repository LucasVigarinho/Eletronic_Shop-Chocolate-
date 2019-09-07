package chocolate_Products;


/** Creating the interface of the taxable class to be implemented by all the classes which has to be taxable */
public interface Taxable {
	
  //taxable final attributes
  public static final double defaultTax = 0.12;  
  public static final double eletronictTax = 0.10; 
  public static final double tvTax = 0.16; 
  public static final double addTax = defaultTax + 0.05; 
 
}//closing the taxable class
