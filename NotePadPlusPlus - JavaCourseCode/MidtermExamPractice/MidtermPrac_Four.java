import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MidtermPrac_Four {
	public static void main(String[] args){
		
		/*
			Create a "Guess the Number" game in Java using arrays, random numbers, and switch statements. 
			The game should generate a random target number and allow the player to make up to 6 guesses. 
			For each guess, the program should indicate if the guess was "too high," "too low," or "correct." 
			If the player does not guess the number in 6 attempts, the game ends, and the correct answer is revealed. 
			At the end of the game, output the game history in a tabular format.
			The user need to choose the difficulity at first.

			---
			The expected out should like this:
			- Player guesses the number correctly within 6 attempts:
			
				Welcome to the Guess the Number Game!
				
				Choose difficulty level (1: Easy, 2: Medium, 3: Hard):2

				You selected Medium level. You have 6 attempts.

				A number between 1 and 100 has been chosen. Try to guess it!

				Attempt 1: Enter your guess: 50
				Too high.

				Attempt 2: Enter your guess: 25
				Too low.

				Attempt 3: Enter your guess: 35
				Too low.

				Attempt 4: Enter your guess: 42
				Correct! You've won!

				Game History:
				--------------------------------
				| Attempt | Guess | Feedback   |
				--------------------------------
				| 1       | 50    | Too high   |
				| 2       | 25    | Too low    |
				| 3       | 35    | Too low    |
				| 4       | 42    | Correct    |
				--------------------------------
			- Player fails to guess the number within 6 attempts:
				Welcome to the Guess the Number Game!
				
				Choose difficulty level (1: Easy, 2: Medium, 3: Hard):2

				You selected Medium level. You have 6 attempts.
				
				A number between 1 and 100 has been chosen. Try to guess it!

				Attempt 1: Enter your guess: 60
				Too high.

				...

				Attempt 6: Enter your guess: 12
				Too low.

				Game over! The number was 34.

				Game History:
				--------------------------------
				| Attempt | Guess | Feedback   |
				--------------------------------
				| 1       | 60    | Too high   |
				| 2       | 45    | Too high   |
				| ...     | ...   | ...        |
				| 6       | 12    | Too low    |
				--------------------------------
		
		*/
		
		/* ### === Start the code here === ### */
		
			/* === Set the variables ===*/
		
			Scanner scn = new Scanner(System.in);
			Random rdm = new Random();
		
			int[] userInput = new int[10]; // Initialize the array to store up to 10 guesses
			int randomNum = rdm.nextInt(100)+1;
			
			String[] gameHistoryElement = {"Attempt", "Guess", "Feedback"};
			String[][] gameHistoryContent = new String[10][3]; // A method to create an empty array.
			
			/* === Ask the difficulity and show the hello message === */
			
			System.out.println("Choose difficulty level (1: Easy, 2: Medium, 3: Hard):");
			int difficulty = scn.nextInt();
			int maxAttempts;
			
			switch(difficulty){
				
				case 1: // Easy
					maxAttempts = 10;
					System.out.println("You selected Easy level. You have " + maxAttempts + " attempts.");
					break;
				
				// ---
				
				case 2: // Medium
					maxAttempts = 6;
					System.out.println("You selected Medium level. You have " + maxAttempts + " attempts.");
					break;
				
				// ---
				
				case 3: // Hard
					maxAttempts = 3;
					System.out.println("You selected Hard level. You have " + maxAttempts + " attempts.");
					break;
				
				// ---
				
				default: // Invalid Selection
					maxAttempts = 0;
					System.out.println("Invalid choice. Please select 1, 2, or 3.");
					break;
			}
			
			// Game logic here based on maxAttempts
			System.out.println("Starting the game with " + maxAttempts + " attempts.");
			
			System.out.println("Welcome to the Guess the Number Game! \n A number between 1 and 100 has been chosen. Try to guess it!");
			
			// The boolean that the guesss is correct or not.
			boolean isCorrect = false;
			
			/* === Attempt the user to input guess value with using the loop. Also check the answer and response  ===*/
			
				for (int i = 0; i < maxAttempts; i++) {  // Loop for a maximum of 6 attempts
    
					System.out.printf("Attempt %d: Enter your guess: ", i + 1);
					userInput[i] = scn.nextInt();
					
					// Record the attempt number and the user's guess in the game history
					gameHistoryContent[i][0] = String.valueOf(i + 1);  // Save the attempt number
					gameHistoryContent[i][1] = String.valueOf(userInput[i]);  // Save the guess made by the user
					
					/* Use if statement to check the user's guess and provide feedback */
					if (userInput[i] == randomNum) {
						System.out.println("Correct! You've won!");
						gameHistoryContent[i][2] = "Correct";
						break;  // Exit the loop if the correct number is guessed
					} else if (userInput[i] > randomNum) {
						System.out.println("Too high. Try Again.");
						gameHistoryContent[i][2] = "Too high";
					} else if (userInput[i] < randomNum) {
						System.out.println("Too low. Try Again.");
						gameHistoryContent[i][2] = "Too low";
					}

					// Check if this is the last attempt
					if (i == maxAttempts-1) {
						System.out.printf("Game over. The correct number was %d.\n", randomNum);
					}
					
				}
					
			/* === Print out the game history in a tabular format === */
			
				// Frist layer : Print the table header and lines(-)
				System.out.println(" ========= Game History ========");
				
				/*
				System.out.println("-".repeat(50));
				for (int i = 0 ; i <= 2; i++){
					System.out.printf(" | ");
					System.out.printf(" %s ", gameHistoryElement[i]);
				}
				System.out.println("");
				System.out.println("-".repeat(50));
				*/
				
				System.out.println("-".repeat(50));
				System.out.printf("| %-8s | %-5s | %-10s |\n", gameHistoryElement[0], gameHistoryElement[1], gameHistoryElement[2]);
				System.out.println("-".repeat(50));
				
				for (int i = 0; i < maxAttempts ; i++){
					if (gameHistoryContent[i][0] != null){
						System.out.printf("| %-8s | %-5s | %-10s |\n", gameHistoryContent[i][0], gameHistoryContent[i][1], gameHistoryContent[i][2]);
					}
				}
				System.out.println("-".repeat(50));
			
			
		
		/* ### === End the code here === ### */
		
	}
}