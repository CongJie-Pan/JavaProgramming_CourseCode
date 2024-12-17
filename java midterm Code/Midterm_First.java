public class Midterm_First {
	public static void main(String[] args){
		
		/* In the range of 1 to 10,000:
           1. Find the sum of all numbers divisible by 3 and store it in sum1
           2. Find the sum of all numbers divisible by 5 and store it in sum2
           3. Find the sum of all numbers divisible by 7 and store it in sum3
           4. Calculate: sum1 - sum2 - sum3
        */
		
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double overallSum = 0;
		
		for(int i = 1; i<=10000;i++){
			
			if( i % 3 == 0){
				sum1 += i; // Store the sum of the i % 3 ==0
			}
			
			if( i % 5 == 0){
				sum2 += i; // Store the sum of the i % 3 ==0
			}
			
			if( i % 7 == 0){
				sum3 += i; // Store the sum of the i % 3 ==0
			} 
			
		}
		overallSum = sum1 - sum2 - sum3;
		
		
		System.out.printf("Sum of numbers divisible by 3 (sum1) = %.0f%n", sum1);
        System.out.printf("Sum of numbers divisible by 5 (sum2) = %.0f%n", sum2);
        System.out.printf("Sum of numbers divisible by 7 (sum3) = %.0f%n", sum3);
        System.out.printf("Final result (sum1 - sum2 - sum3) = %.0f%n", overallSum);
	}
}