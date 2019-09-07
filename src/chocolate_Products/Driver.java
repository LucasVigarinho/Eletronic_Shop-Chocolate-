package chocolate_Products;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/** Creating Driver class to manage and call all the classe s**/
public class Driver
{
	/** Creating the constants private variables in order to use a defined nomenclature to identify each class when reading a txt file  */
	private static final String CHAIR = "chair";
	private static final String TABLE = "table";
	private static final String DRESSER = "dresser";
	private static final String SPOON = "spoon";
	private static final String FORK = "fork";
	private static final String KNIFE = "knife";
	private static final String PLATE = "plate";
	private static final String KEYBOARD = "keyboard";
	private static final String MOBILE_PHONE = "mobilephone";
	private static final String MP3_PLAYER = "mp3player";
	private static final String TV_SET = "tvset";

	/** Creating the ArrayList in order to follow the annunciate */
	static ArrayList<Product> products = new ArrayList<>();

	
	/** Creating a method add in order to populate the array list from the main method */
	public static int add(){
		
		readingData();
		
		return 0;
	}// closing the add method

	/** Created main method */
	@SuppressWarnings("resource")
	public static void main(String[] args){
		// Call the method to populate the array list
		Driver.add();
		
		List<Integer> a = new ArrayList<>();
		

		// Instantiating the objects scanners to
		Scanner buyer = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		// Creating variables to be used
		String toBuy = null;
		System.out.println(" ");
		System.out.println(" ================================================================================");
		System.out.println("                                                                                 ");
		System.out.println("                  WEEK 5 - ABSTRACT CLASSES & INTERFACES                         ");
		System.out.println("                                                                                 ");
		System.out.println(" ================================================================================");
		System.out.println("                                                                                 ");

		// Do looping to creating the menu
		do
		{
			System.out.println("                                                                                  ");
			System.out.println("                                      MENU                                        ");
			System.out.println("                                                                                  ");
			System.out.println(" (1) Buy a Product                                                                ");
			System.out.println(" (2) Check stock                                                                  ");
			System.out.println(" (3) Display product details                                                      ");
			System.out.println(" (4) Calculate Tax Return                                                         ");
			System.out.println(" (5) Restock                                                                      ");
			System.out.println(" (6) Exit                                                                         ");
			System.out.println("                                                                                  ");
			System.out.print(" Chose an option -> ");

			// Switch statement to give options of the menu
			switch (input.nextInt())
			{
			// (1) Buy a Product
			case 1:
				int quantity = 0;
				int tempQuant = 0;
				System.out.println("                                                                                     ");
				System.out.println(" =================================================================================== ");
				System.out.println("                         List of products available in stoque.                     | ");
				System.out.println(" =================================================================================== ");
				System.out.println("                                                                                   | ");
				System.out.println("   |FURNITURE		   |KITCHENWARE           |ELETRONIC DEVICES               | ");
				System.out.println("   |-- chair 1, 2 and 3.   |-- spoon 1, 2 and 3.  |-- keyboard 1, 2 and 3.         | ");
				System.out.println("   |-- table 1, 2 and 3.   |-- fork 1, 2 and 3.   |-- mobile Phone 1, 2 and 3.     | ");
				System.out.println("   |-- dresser 1, 2 and 3. |-- knife 1, 2 and 3.  |-- mp3 player 1, 2 and 3.       | ");
				System.out.println("   |-- plates 1, 2 and 3.  |-- tv 1, 2 and 3.                                      | ");
				System.out.println("                                                                                   | ");
				System.out.println("                                                                                   | ");
				System.out.println(" =================================================================================== ");
				System.out.print(" Which product do you choose to buy ? ------>> ");
				toBuy = buyer.nextLine();
				System.out.println("                                                                                     ");

				// variable to help in the for loop to identify if the product was printed out already
				String last = null;

				System.out.println("                                                                                     ");
				System.out.println("                                                                                     ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(
						" ProductId                        Product Name                           Price                  Tax (for 1 pç)   ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(
						"                                                                                                                  ");

				// for loop to print out the name of the productId(s) similar(s). In case of the user do not know and insert inexactly name of the productId
				for (int i = 0; i < products.size(); i++)
				{
					// if statement to verify if the product is exactly the name is in the stock
					if (products.get(i).getProductId().equalsIgnoreCase(toBuy))
					{
						// Give the value of the quantity of this specific productId
						quantity = products.get(i).getQuantity();
						System.out.print(" " + (products.get(i).getProductId()) + "                         "
								+ products.get(i).getName() + "                          " +
								products.get(i).getPrice() + "                     ");
						System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), 1)));
						System.out.println("");
					// If the productId is not exactly the same of the productId, but similar
					}
					else if (products.get(i).getProductId().contains(toBuy))
					{
						// To avoid printing many times the same name of productId
						if (products.get(i).getProductId().equalsIgnoreCase(last))
						{
						}
						else
						{
							System.out.print(" " + (products.get(i).getProductId()) + "                         "
									+ products.get(i).getName() + "                          " +
									products.get(i).getPrice() + "                     ");
							System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), 1)));
							System.out.println("");
							last = products.get(i).getProductId();
						} // if statement
					} // if statement
				} // for loop
				System.out.println();
				System.out.println(
						" ================================================================================================================");
				System.out.println();

				// if statement to verify the product is not in the stoque
				if (quantity > 0)
				{
					// print out message to inform the user about the quantity of the product to buy
					System.out.println();
					System.out.println();
					System.out.println(" We have " + quantity + " of the product " + toBuy + " in stock.                         ");
					System.out.println(" ================================================================================================================");
					System.out.print(" How many of " + toBuy + " ?" + " Quantity to buy ------>> ");
					// Variable to absorb the interaction of the quantity to buy
					tempQuant = input.nextInt();
					// if statement in order to verify if the quantiy of the user want to buy is higger or lower of the product
					// and print out a message necessary according with the situation
						
					if (tempQuant <= quantity)
					{
						for (int i = 0; i < products.size(); i++)
						{
							if (products.get(i).getProductId().equalsIgnoreCase(toBuy))
							{
								String t = null;
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println("                                                                                     ");
								System.out.println(
										" ================================================================================================================");
								System.out.println(
										" ProductId                        Product Name               Quantity              Price    |    Tax   |   Total  ");
								System.out.println(
										" ================================================================================================================");
								System.out.println(
										"                                                                                                                  ");
								System.out.print(" " + (products.get(i).getProductId()) + "                          "
										+ products.get(i).getName() + "                 " + tempQuant + "                  " +
										products.get(i).getPrice() + "        ");
								System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), tempQuant)));
								System.out.print("       ");
								System.out.printf("%.2f", ((products.get(i).taxReturn(products.get(i).getProductId(), tempQuant)) + (products.get(i).getPrice())*tempQuant)); 
								
								System.out.println("");
								System.out.println(
										" ================================================================================================================");
								System.out.print(" Do you confirm the purchase described above? y or n " );
								t = buyer.nextLine();
								System.out.println();
								if (t.equalsIgnoreCase("y") ){
									products.get(i).buyProducts(toBuy, tempQuant);
//									creatingSalesTxt(products.get(i).getProductId(), products.get(i).getName(), tempQuant, products.get(i).getPrice(), products.get(i).taxReturn(products.get(i).getProductId(), tempQuant));
								}else {
									System.out.print(" Purchase not performed successfully" );
								}//closing if statement
								
							} // close if statement
						} // close for loop
					}
					else
					{
						System.out.println("                                                                                         ");
						System.out.println(" Sorry.                                                                                  ");
						System.out.println("                                                                                         ");
						System.out.println(" We have only " + quantity + " of the product " + toBuy + " in stock.                         ");
						System.out.println(" ================================================================================================================");
					} // Closing if statement
				}
				else
				{
					System.out.println(" Sorry.                                                                              ");
					System.out.println("                                                                                     ");
					System.out.println(" To buy a product, you have to specify only one ProductId.                           ");
					System.out.println(" Please, choose one of the productsId described above.                               ");
				} // if statement
				System.out.println(" ");// visual motives

				break;

				// (2) Check stoque
			case 2:
				// creating local variable
				int temp2 = 0;
				System.out.println("                                                                                     ");
				// interact with the user printing out a message to absorb the product of interest
				System.out.print(" Which product do you want to check ?    ");
				toBuy = buyer.nextLine();
				// create the visual of the display check stoque
				System.out.println("                                                                                     ");
				System.out.println("                                                                                     ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(
						"                                         CHECK STOQUE                                                            ");
				System.out.println(
						" ================================================================================================================");
				System.out.println("                                                                                     ");

				// Create the for loop to verify all the products in the arrayLIst
				for (int i = 0; i < products.size(); i++)
				{
					if (products.get(i).getProductId().equalsIgnoreCase(toBuy))
					{

						// using the check stoque method
						products.get(i).checkStoque(toBuy);

						temp2 = 1;
					}
					else if (products.get(i).getProductId().contains(toBuy) && temp2 == 0)
					{

						products.get(i).checkStoque(toBuy);
					} // close if statement
				} // close for loop
				System.out.println();
				System.out.println(
						" ================================================================================================================");
				System.out.println();

				break;

				// Display product details
			case 3:
				// creating local variables
				int eq = 0;
				int ct = 0;
				int dif = 0;
				
				// interacting with the user to absorb which product print out details of
				System.out.println("           ");
				System.out.print(" Product details - from which product ?    ");
				toBuy = buyer.nextLine();
				// verify in all the array and use the product details method to print out the message,
			
				for (int i = 0; i < products.size(); i++){
					if (products.get(i).getProductId().equalsIgnoreCase(toBuy)){
						
						// using the method product details
						products.get(i).productDetails(toBuy);
						eq += 1;
					}
					else if (Driver.products.get(i).getProductId().contains(toBuy) && eq == 0)
					{
						// using the method product details
						products.get(i).productDetails(toBuy);
						ct += 1;
						eq += 1;
					} // closing if statement
				} // closign for loop
				for (int i = 0; i < Driver.products.size(); i++)
				{
					if (eq == 0 && ct == 0 && dif == 0)
					{
						// using the method product details
						products.get(i).productDetails(toBuy);
					} // if statement
				} // for loop

				break;

				// (4) Calculate Tax Return
			case 4:
				// Creating local variables
				int eq4 = 0;
				int ct4 = 0;
				int dif4 = 0;
				String product = null;
				int quant = 0;
				// print out message to interact with the user to absorb product and quantity to be calculated
				System.out.println(" ");
				System.out.print(" Product to be calculate --> ");
				product = buyer.nextLine(); // absorb product
				System.out.println(" ");
				System.out.print(" What is the quantity of the product " + product + " ? --> ");
				quant = input.nextInt(); // absorb quantity
				// Print out display to present data
				System.out.println(" ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(
						" ProductId                        Quantity                           Tax                     Total (price + tax) ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(" ");

				// Create a for loop in order to identify if the product informed by the user is an specific ProductId or part of some ProductIds
				for (int m = 0; m < products.size(); m++)
				{
					// Create the first if statement to identify and print out tax info of the productId which is equal.
					if (products.get(m).getProductId().equalsIgnoreCase(product))
					{
						System.out.print(" " + products.get(m).getProductId() + "                        " + quant
								+ "                               " );
						System.out.printf("%.2f", (products.get(m).taxReturn(products.get(m).getProductId(), quant)));
						System.out.print("                       ");
						System.out.printf("%.2f",((products.get(m).taxReturn(products.get(m).getProductId(), quant) + 
											products.get(m).getPrice())* quant));
						System.out.print(" (");
						System.out.print(products.get(m).getPrice() + " + " );
						System.out.printf("%.2f", products.get(m).taxReturn(products.get(m).getProductId(), quant));
						System.out.print( ")" );
						System.out.println( );
						eq4 += 1;

						// Create the second if statement to identify and print out tax info of the productId which contain part of the productId name, containing a similar name.
					}
					else if (products.get(m).getProductId().contains(product) && eq4 == 0)
					{
						System.out.print(" " + products.get(m).getProductId() + "                        " + quant
								+ "                               " );
						System.out.printf("%.2f", (products.get(m).taxReturn(products.get(m).getProductId(), quant)));
						System.out.print( "                       ");
						System.out.printf("%.2f",((products.get(m).taxReturn(products.get(m).getProductId(), quant) + products.get(m).getPrice())* quant));
						System.out.print(" (");
						System.out.print(products.get(m).getPrice() + " + " );
						System.out.printf("%.2f", products.get(m).taxReturn(products.get(m).getProductId(), quant));
						System.out.print( ")" );
						System.out.println( );
						ct4 += 1;
					} // close if statement
				} // close for loop

				// Create a for loop to print out a message in case of the product search by the user is not in our system.
				for (int i = 0; i < products.size(); i++)
				{
					if (eq4 == 0 && ct4 == 0 && dif4 == 0)
					{
						System.out.println(" The product " + product
								+ " was not found in our Stoque to be calculate. Try changing the productId name. ");
						dif4 += 1;
					} // close if statement
				} // close for loop

				System.out.println();
				System.out.println(
						" ================================================================================================================");
				System.out.println();

				break;
			//Create the option to restoque
			case 5:
				System.out.println();
				System.out.print(" Which product do you want restock? ------>> ");
				toBuy = buyer.nextLine();
				System.out.println("                                                                                     ");

				// variable to help in the for loop to identify if the product was printed out already
				String last1 = null;
				int quantityr = 0;

				System.out.println("                                                                                     ");
				System.out.println("                                                                                     ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(
						" ProductId                        Product Name                           Price                  Tax (for 1 pç)   ");
				System.out.println(
						" ================================================================================================================");
				System.out.println(
						"                                                                                                                  ");

				// for loop to print out the name of the productId(s) similar(s). In case of the user do not know and insert inexactly name of the productId
				for (int i = 0; i < products.size(); i++){
					// if statement to verify if the product is exactly the name is in the stock
					if (products.get(i).getProductId().equalsIgnoreCase(toBuy)){
						// Give the value of the quantity of this specific productId
						quantityr = products.get(i).getQuantity();
						System.out.print(" " + (products.get(i).getProductId()) + "                         "
								+ products.get(i).getName() + "                          " +
								products.get(i).getPrice() + "                     ");
						System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), 1)));
						System.out.println("");
						// If the productId is not exactly the same of the productId, but similar
					}//close if statement
					else if (products.get(i).getProductId().contains(toBuy)){
						// To avoid printing many times the same name of productId
						if (products.get(i).getProductId().equalsIgnoreCase(last1)){
						}//close if statement
						else{
							System.out.print(" " + (products.get(i).getProductId()) + "                         "
									+ products.get(i).getName() + "                          " +
									products.get(i).getPrice() + "                     ");
							System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), 1)));
							System.out.println("");
							last1 = products.get(i).getProductId();
						} // if statement
					} // if statement
				} // for loop
				System.out.println();
				System.out.println(
						" ================================================================================================================");
				System.out.println();
				// if statement to verify the product is not in the stoque
				if (quantityr > 0)
				{
				// if statement to verify the product is not in the stoque
				if (quantityr >= 0){
					// print out message to inform the user about the quantity of the product to buy
					System.out.println();
					System.out.println();
					System.out.println(" We have " + quantityr + " of the product " + toBuy + " in stock.                         ");
					System.out.println(" ================================================================================================================");
					System.out.print(" How many of " + toBuy + " ?" + " Quantity to restock ------>> ");
					// Variable to absorb the interaction of the quantity to buy
					tempQuant = input.nextInt();
					// if statement in order to verify if the quantiy of the user want to buy is higger or lower of the product
					// and print out a message necessary according with the situation

			
						for (int i = 0; i < products.size(); i++){
							if (products.get(i).getProductId().equalsIgnoreCase(toBuy)){
								String t = null;
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println("                                                                                     ");
								System.out.println(
										" ================================================================================================================");
								System.out.println(
										" ProductId                        Product Name               Quantity              Price    |    Tax   |   Total  ");
								System.out.println(
										" ================================================================================================================");
								System.out.println(
										"                                                                                                                  ");
								System.out.print(" " + (products.get(i).getProductId()) + "                          "
										+ products.get(i).getName() + "                 " + tempQuant + "                  " +
										products.get(i).getPrice() + "        ");
								System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), tempQuant)));
								System.out.print("       ");
								System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), tempQuant) + products.get(i).getPrice())*tempQuant); 
								
								System.out.println("");
								System.out.println(
										" ================================================================================================================");
								System.out.print(" Do you confirm the restock described above? y or n " );
								t = buyer.nextLine();
								System.out.println();
								if (t.equalsIgnoreCase("y") ){
									
									products.get(i).restock(toBuy, tempQuant);
									                        
								}else {
									System.out.print(" Restoque not performed successfully" );
								}//closing if statement
								
							} // close if statement
						} // close for loop
				}
				else
				{
					System.out.println(" Sorry.                                                                          ");
					System.out.println("                                                                                 ");
					System.out.println(" Please, choose another specific productId.                                      ");
				} // Closing if statement
				}else{
					System.out.println(" Sorry.                                                                              ");
					System.out.println("                                                                                     ");
					System.out.println(" To restock a product, you have to specify only one ProductId.                           ");
					System.out.println(" Please, choose one of the productsId described above.                               ");
				} // if statement
			
				break;
				
			// (6) Exit
			case 6:
				System.out.println();
				System.out.println("                                    The End   ");
				saveData();
				System.exit(0);
				break;

			default:
				System.out.println();
				System.out.println("  Wrong insertion  ");
				System.out.println();
			}// switch statement

		}
		while (products.size() != 0);
		buyer.close();
		input.close();
	}// main method

	/** create the reading Txt method in order to ready the initial parameter to populate the Array LList*/ 
	public static void readingTxt(){
		Scanner fileIn;
		String fileName = "input.txt";
		try
		{	
			fileIn = new Scanner(new FileReader(fileName));//creating the variable to absorb the next line
			while (fileIn.hasNextLine())//create the while loop to to read the next line until null
			{

				String line = fileIn.nextLine();
				String[] split = line.split(";");

				String type = split[0];

				//opening the switch statement in order to identify the strings from the txt file, 
				//splitting and casting following the structure of the constructor of each product
				switch (type) {
				case CHAIR:
					Chairs chair = new Chairs(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()));
					products.add(chair);
					break;
					
				case TABLE:
					Tables table = new Tables(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()));
					products.add(table);

					break;
				case DRESSER:
					Dressers dresser = new Dressers(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()),Integer.parseInt(split[5].trim()),Integer.parseInt(split[6].trim()),
							Integer.parseInt(split[7].trim()));
					products.add(dresser);
					
					break;
				case SPOON:
					Spoons spoon = new Spoons(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()), split[5].trim());
					products.add(spoon);
					
					break;
				case FORK:
					Forks fork = new Forks(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()), split[5].trim());
					products.add(fork);
					
					break;
				case KNIFE:
					Knives knife = new Knives(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()), split[5].trim());
					products.add(knife);

					break;
				case PLATE:
					Plates plate = new Plates(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()), split[5].trim());
					
					products.add(plate);
					break;
				case KEYBOARD:
					Keyboards keyboard = new Keyboards(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()));
					products.add(keyboard);

					break;
				case MOBILE_PHONE:
					MobilePhones mobilephone = new MobilePhones(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()));
					products.add(mobilephone);

					break;
				case MP3_PLAYER:
					MP3Players mp3player = new MP3Players(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()), Integer.parseInt(split[5].trim()));
					products.add(mp3player);
					
					break;
				case TV_SET:
					TVSets tvset = new TVSets(split[1].trim(), split[2].trim(), Double.parseDouble(split[3].trim()),
							Integer.parseInt(split[4].trim()), Double.parseDouble(split[5].trim()));
					products.add(tvset);
					break;
					
				default:
					break;
				}//closing the switching statement
			}//end while

			//closing the fileIn
			fileIn.close();
		
		}//end try
		catch (FileNotFoundException e){
			System.out.println("Error: " + e.getMessage());
		} // end catch
	}//closing the reading txt method

	/** creating the save data method, in order to save the movements when the sistem finishes */
	public static void saveData(){

		String fileName = "save.data";
		ObjectOutputStream fileOut;

		try{

			fileOut = new ObjectOutputStream(new FileOutputStream(fileName));

			//creating a for loop to write from the array list to the save.data. Objects.
			for (int i = 0; i < products.size(); i++){
				fileOut.writeObject(products.get(i));
			} // end for

			//closing the fileOut and cleaning it
			fileOut.close();
		

			System.out.println(" Moviment of the day saved");

		} // end try

		catch (IOException e){

			System.out.println("IO Error : " + e.getMessage());
		}//closing the catch 
	}//closing the save data method
	
	/** Creating a method in order to read the Object from the data file saved on the movimentation before*/
	public static void readingData(){

		String fileName = "save.data";
		ObjectInputStream fileIn;
		Product aProduct;

		try{
			//Creating the local variable to taking from the file the object and populate the array list
			fileIn = new ObjectInputStream(new FileInputStream(fileName));
			aProduct = (Product) fileIn.readObject();
			
			//creating the while to populate the array list
			while (aProduct != null){
				//create the if statement for each product to locate the products, using instanceof
				products.add(aProduct);

				
				aProduct = (Product) fileIn.readObject();
			}//end while

			fileIn.close();
			

		}//end try
		catch (FileNotFoundException e){
			System.out.println("Error: " + e.getMessage());
			//calling reding text in case the no localization of the save data file
			readingTxt();

		}//end catch
		catch (IOException e){
			//this will always be called
			// so need to check to see if objects were read
			// or there is a general IO error
			if (products.size() == 0)
				System.out.println("IO Error : " + e.getMessage());
		} // end catch
		catch (ClassNotFoundException e){
			System.out.println("Class Error : " + e.getMessage());
		} // end catch
	}//closing the method reading Data

	/** creating the sales method to write in a file txt the sales like a daily report */
	public static void creatingSalesTxt(String productId, String name, int quantity, double price, double taxReturn){

		//creating the local variables
		PrintWriter fileOut;
		String fileName = "sales.txt"; //defining the file name
		Date date = new Date(); //get the day date
		StringBuilder sb = new StringBuilder(); //transform binary in string 

		try{
			//write the string received through the variables when called the method
			fileOut = new PrintWriter(new FileWriter(fileName, true));

			//patter to write in the sales report
			sb.append(date.toString());
			sb.append(" | Venda realizada com sucesso ");
			sb.append(" |Product Id: " + productId);
			sb.append(" | Product Name: " + name);
			sb.append(" | Quantity: " + quantity);
			sb.append(" | Unit price: " + price);
			sb.append(" | Total price: " + ((quantity * price)+taxReturn));
			sb.append(" | Tax rate: " + taxReturn);

			fileOut.println(sb.toString());

			fileOut.close();

		}//end try

		catch (IOException e){
			e.printStackTrace();
		}//closing catch

	}//end main

}// closing driver