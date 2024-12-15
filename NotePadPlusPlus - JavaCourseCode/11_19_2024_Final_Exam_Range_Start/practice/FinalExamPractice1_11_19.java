public class FinalExamPractice1_11_19 {
    
    /*
     * This program calculates squares of numbers and prints stars in specific patterns.
     * Includes:
     * 1. A method to calculate squares of numbers.
     * 2. A method to print a single line of 50 stars.
     * 3. A method to print multiple lines of stars.
     */
    
    public static void main(String[] args) {
        // Print a message and then a single line of 50 stars
        System.out.println("This method prints a single line of 50 stars.");
        printOneLineStars();
        
        // Print a message and then 10 lines of 50 stars each
        System.out.println("\nThis method prints 10 lines of 50 stars each.");
        printStars(10);
        
        // Calculate the square of 8 and display the result
        System.out.println("\nCalculate the square of 8 and display the result.");
        int a = 8;
        int ans = calcSquare(a);
        System.out.printf("%d, Square = %d\n", a, ans);
    }
    
    /**
     * Prints a single line of 50 stars.
     * This method does not take any input and does not return any value. So, use static 'void'.
     */
    public static void printOneLineStars() {
        for (int i = 0; i < 50; i++) { // Loop to print 50 stars
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after printing stars
    }
    
    /**
     * Prints `n` lines of 50 stars each.
     * This method does not take any input and does not return any value. So, use static 'void'.
	 * 
     * @param n The number of lines to print.
     */
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) { // Loop to print `n` lines of stars
            printOneLineStars(); // Call the method to print a single line of stars
        }
    }
    
    /**
     * Calculates and returns the square of the given number.
	 * This method take input and return int value. So, use static 'int'.
     * 
     * @param n The number to be squared.
     * @return The square of the input number.
     */
    public static int calcSquare(int n) {
        return n * n; // Return the square of the number
    }
}
