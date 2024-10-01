import java.util.Scanner;

public class HW_CircleValue {

    public static void main(String[] args) {

        // Create a Scanner object to receive user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the radius of the circle
        System.out.print("Please enter the circle radius: ");
        double inputRadius = scanner.nextDouble();  // Receive the user input as a floating-point number
		
		// Calculate the circle area
		double circleArea = Math.PI * Math.pow(inputRadius, 2);

        // Display the circle area (use printf for formatted output)
        System.out.printf("The circle with radius %.1f has an area of %.1f\n", inputRadius, circleArea);
		
		System.out.println();
		
		// Display the circle area (use println without formatting)
        System.out.println("Unformatted output: The circle with radius " + inputRadius + " has an area of " + circleArea);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
