/* Name: Blake Munro
 * Program Name: ICE1
 * Date: 2023-01-27
 * Description: This program will take the users name, banner id, a quote, the source of the quote, and a number 
 * */

package project1;

import java.util.*;

public class ICE1 {
	//use scanner for taking user input
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// string variable used for storing name
		String name = "Blake";
		// string variable used for storing banner id
		String banner_id = "100883548";
		// string variable used for storing favorite quote
		String quote = "\"Hello There\" ";
		// string variable used for storing the source of the quote
		String source = "\"Star Wars\"";
		// integer variable used for storing the users favorite number
		int num;
		
		// displays a welcome message, my name and banner id
		System.out.println("Welcome to the awesome number taker. My name is " + name + " and my Banner ID is " + banner_id);
		
		// displays my favorite quote and its source
		System.out.println("My favourite quote is " + quote + "and it is from " + source);
		
		// prompts the user to enter their favorite number
		System.out.println("Please enter your favourite number: ");
		// take the users integer input
		num = input.nextInt();
		// displays a message regarding the users number
		System.out.println("Wow! " + num + " is a really cool number!");

	}

}
