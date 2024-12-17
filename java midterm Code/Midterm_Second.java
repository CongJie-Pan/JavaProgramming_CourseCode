public class Midterm_Second {
	public static void main(String[] args){
		
		/* Create a multiplication table of 3 (from 3×3 to 8×8)
           - Sum all odd products and store in variable 'odd'
           - Sum all even products and store in variable 'even'
           - Calculate the difference between odd and even sums
        */
		
		/* === Create the 3 * 8 (3*3 ~ 8*8) muliply table === */
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 3; i <= 8; i++){
			for(int j = 3; j <= 8; j++){
				int mulResult = i * j;
				System.out.printf(" %d * %d = %d \t", i, j, mulResult);
				
				
				// Check if result is odd or even
                if(mulResult % 2 == 0) {
                    evenSum += mulResult;
                    System.out.print(" (even)\t");
                } else {
                    oddSum += mulResult;
                    System.out.print(" (odd)\t");
                }
            }
            System.out.println(); // New line after each row
			
		}
		System.out.println("\nResults:");
        System.out.println("--------------------------------");
        System.out.printf("Sum of odd products = %d%n", oddSum);
        System.out.printf("Sum of even products = %d%n", evenSum);
        System.out.printf("OddSum(%d) - EvenSum(%d) = %d", oddSum, evenSum, oddSum - evenSum);
    
	}
}