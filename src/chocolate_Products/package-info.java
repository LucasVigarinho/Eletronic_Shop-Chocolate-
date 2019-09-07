/**
 * 
 */
/**
 * @author lucasmaximo
 *
 *
 * 												DEVELOPMENT
 *
 * 						|Product (abstract super class)             |Taxable (interface)
 * 						|---  product ID,              				| -- kitchenware - (defaultTax) = 12%
 * 						|---  name								-	| -- eletronicdevices - (eletronictTax) = 10%
 * 						|---  price									| -- tv sets - (tvTax) = 16% 
 * 						|---  and quantity parameters. 				| -- kitchenware - plastic - (addTax) = (deafaultTax + 5%)
 * 
 * 
 * 	  -	|Furniture (extends Product)		|Kitchenware (extends Product)            - |ElectronicDevices (extends Product)
 * 	  -	|-- chairs,(extends Furniture)		|ALL - additional parameter (material)	  -	|-- keyboards, (extends ElectronicDevices)
 * 	  -	|-- tables,(extends Furniture) 		|-- spoons,  (extends Kitchenware)		  -	|-- mobile phones (extends ElectronicDevices)
 * 	  -	|-- dressers,(extends Furniture)	|-- forks,   (extends Kitchenware)		  -	|-- and mp3 players. (extends ElectronicDevices)
 * 		  |	-- dimensions (parameter/class)	|-- knives,  (extends Kitchenware)		  -	  | -- mp3 additional parameter (memorySize)
 * 			 | -- 3 integers				|-- plates,  (extends Kitchenware)		  -	|-- TV sets, (extends ElectronicDevices)
 * 																					  -	  | -- tv additional parameter (displaySize)
 *
 */
package chocolate_Products;