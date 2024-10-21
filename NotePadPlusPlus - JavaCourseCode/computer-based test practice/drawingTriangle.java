import java.util.Scanner;

public class drawingTriangle{
	public static void main(String args[]){
		
		/* Design a program that uses nested loops to draw different asterisk shapes and 
		lets the user choose which type of shape to draw. 
		The program will output the corresponding asterisk shapes according to the user's input.
		*/
		
		
		Scanner scn = new Scanner(System.in);
		
		/* === User input progress === */
		
		System.out.printf("Choose a pattern to print:\n 1. Left aligned triangle \n 2. Right aligned triangle \n 3. Pyramid \n 4. Inverted triangle\n");
		System.out.println("");
		
		System.out.printf("Please enter your choice(1~4):");
		int inputTriangleChoice = scn.nextInt();
		System.out.println("");
		
		System.out.printf("Enter the number of rows:");
		int inputTriangleRows = scn.nextInt();
		
		/*  === Switching the Trianlge choice === */
		/* According to the choice and rows that the user entered to switch the triangle mode also setting the rows. 
		This step can be completed in the switch statement  */
		
		switch(inputTriangleChoice){
			
			case 1:
			/*Left aligned triangle */
			for(int i = 1; i<= inputTriangleRows; i++){
				for(int j=1; j<= i ; j++){
					System.out.printf("*");
				}
				System.out.println();
			}
			break;
			
			case 2:
			/* Right aligned triangle */
			for(int i = 1; i<= inputTriangleRows ; i++){ // the inner scope control the lines
				for(int j = 1 ; j<= inputTriangleRows - i ; j++){ // adding the blank
					System.out.printf(" ");
				}
				
				for(int k = 1; k <= i ; k++){ // output the "*"
					System.out.printf("*");
				}
				System.out.println(""); // change line
			}		
			break;
			
			case 3:
			/* Pyramid */
			for (int i = 1; i <= inputTriangleRows; i++) {   // The inner loop should depend on the outer i to dynamically control the amount of output.
				for (int j = 1; j <= inputTriangleRows - i; j++) {  // adding the "blank"
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i - 1); k++) {  // output "*"
					System.out.print("*");
				}
				System.out.println();  // change line
			}
			break;
			
			case 4:
			/* Inverted triangle */
			for(int i=1;i<= inputTriangleRows; i++){
				for(int j=inputTriangleRows ; j>= i ; j-- ){ // The inner loop should depend on the outer i to dynamically control the amount of output. 
					System.out.printf("*");
				}
				System.out.println();
			}
			break;
			
			default:
                System.out.println("Invalid choice, please select a number between 1 and 4.");
			
		}
		
		scn.close();
		
	}
}