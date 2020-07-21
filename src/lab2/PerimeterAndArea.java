package lab2;

import java.util.Scanner;

public class PerimeterAndArea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
		
	System.out.println ("How many feet long is the classroom?");
		double length = scnr.nextDouble();
		
	System.out.println ("How many feet wide is the classroom?");
		double width = scnr.nextDouble();
		
	System.out.println ("How many feet high is the room?");
		double height = scnr.nextDouble();
	
	System.out.println ("The area of the room is " + (length*width) + " square feet");
	
	System.out.println ("The perimiter of the room is " + ((length *2) + (width *2)) + " feet");
		
	System.out.println ("The volume of the room is " + (length * width * height) + " cubic feet");
	
	System.out.println ("Do you want to keep measuring rooms?");
	
	scnr.close();
	}
	
}
