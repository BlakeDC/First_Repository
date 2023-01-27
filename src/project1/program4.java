package project1;

import java.util.*;

public class program4 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String name;
		int id;
		int year;
		int courses;
		double gpa;
		
		System.out.println("Please Enter Your Name");
		name = input.nextLine();	
		System.out.println("Your Name Is: " + name);
		
		System.out.println("Please Enter Your ID");
		id = input.nextInt();
		System.out.println("Your ID is: " + id);
		
		System.out.println("Please Enter The Year");
		year = input.nextInt();
		System.out.println("The Year Is: " + year);
			
		System.out.println("Please Enter The Number Of Enrolled Courses");
		courses = input.nextInt();
		System.out.println("You Are In: " + courses + "courses");
		
		System.out.println("Please Enter Your GPA");
		gpa = input.nextDouble();
		System.out.println("Your GPA Is: " + gpa);
	}

}
