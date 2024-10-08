import java.util.Scanner;

public class HW_2024_10_08 {
	
	/* Chapter 4 Coding Homework Questions 15. 16. 17.*/
	
	public static void main(String[] args){
		
		System.out.println("Chapter 4 Coding Questions Homework 15. 16. 17.");
		
		Scanner scanner = new Scanner(System.in);
		
		// ----------
		
		System.out.println("=======Q:15=======");
		
		/* 15. 
		Try to write a program for converting pounds to kilograms by 
		calculating how many kilograms are in 100 pounds with the following 
		conversion . formula: 1 pound = 0.454 kilograms.
		*/
		
		double OnePound = 0.454; // one pound eual to 0.454 kilograms
		
		double OneHundredPounds = OnePound * 100;
		
		System.out.printf("100 pounds equal to %.4f kilograms\n",OneHundredPounds);
		
		// ----------
		
		System.out.println("=======Q:16=======");
		
		/* 16. 
		Try to write a program for converting kilograms to pounds by 
		calculating how many pounds are in 100 kilograms with the following 
		conversion . formula: 1 pound = 0.454 kilograms.
		*/
		
		double OneKilogram = 1.0 / 0.454; // one kilogram eual to 1.0 / 0.454 pound
		
		double OneHundredkilograms = OneKilogram * 100.0;
		
		System.out.printf("100 kilograms equal to %.4f pounds\n",OneHundredkilograms);
		
		// ----------
		
		System.out.println("=======Q:17=======");
		
		/* 
		17. Write a program to calculate the area of a rectangle 
		by entering its length and width.
		*/
		
		System.out.print("Please enter the width you want:");
		double width = scanner.nextDouble();
		
		System.out.print("Please enter the length you want:");
		double length = scanner.nextDouble();
		
		double rectArea = width * length ;
		
		System.out.printf("The rectangle area is %.2f \n", rectArea);
		
	}
}
