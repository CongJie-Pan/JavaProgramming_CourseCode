import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        // Create a scanner object to receive user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.println("請輸入一個十進位數字：");
        int decimal = scanner.nextInt();  // Store user input as an integer

        // Convert the decimal number to binary (base 2)
        String binary = Integer.toBinaryString(decimal);

        // Convert the decimal number to octal (base 8)
        String octal = Integer.toOctalString(decimal);

        // Convert the decimal number to hexadecimal (base 16)
        String hexadecimal = Integer.toHexString(decimal).toUpperCase(); // Use uppercase for better readability

        // Check if the decimal number corresponds to a valid ASCII character
        char asciiChar;
        if (decimal >= 32 && decimal <= 126) {
            asciiChar = (char) decimal; // Cast the decimal to char to get the ASCII character
        } else {
            asciiChar = '?'; // If the decimal is not a valid printable ASCII character, use '?' as a placeholder
        }

        // Display the conversion results to the user
        System.out.println("二進位 (Binary): " + binary);
        System.out.println("八進位 (Octal): " + octal);
        System.out.println("十六進位 (Hexadecimal): " + hexadecimal);
        System.out.println("ASCII 字元 (Character): " + asciiChar);

        // Close the scanner object
        scanner.close();
    }
}
