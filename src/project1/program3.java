package project1;

import java.util.*;

public class program3 {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double fahrenheit;
		double celsius;
		
		System.out.println("Enter Fahrenheit temperature");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println(Double.toString(fahrenheit) + " Fahrenheit is " + celsius + " Celsius");

	}

}
