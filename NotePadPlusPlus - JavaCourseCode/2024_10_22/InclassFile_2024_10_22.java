import java.util.Scanner;

public class InclassFile_2024_10_22 {
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		/* Code Area One */
		/*
		int i = 1, sum = 0;
		while(sum <= 30){ // increment the number within sum = 20
			sum = sum + i;
			if (sum>=20){ // to avoid the situation that sum plus to 20
				break;
			}
			System.out.printf(" i = %d, sum = %d \n", i, sum);
			i = i+1;
		}
		*/
		
		/* Code Area Two */
		/*
		int evenSum = 0, oddSum = 0 , i=0;
		
		while(i<=100){
			if (i % 2 ==0){
				evenSum += i;
			}else if( i % 2 != 0){
				oddSum += i;
			}
			i++;
		}
		System.out.printf("i = %d, EvenSum = %d \n",i, evenSum);
		System.out.printf("i = %d, OddSum = %d \n",i, oddSum);
		*/
		
		/* Code Area Three - do while */
		/*
		int inputNum = 0, sum = 0;
		do{
			System.out.println("Please input an integer: ");
			inputNum = scn.nextInt();
		}while(inputNum < 0);
		
		*/
		
		/* Code Area Four - Nested For loop */
		/*
		for(int i=1;i<=10;i++){
			for(int j=1; j<= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		//System.out.println();
		
		/*
		for(int i=1;i<=10;i++){
			for(int j=10; j >= i ; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/* Code Area Five - Continue */
		for (int i = 1; i <= 10; i++) {
            // If the number is odd, skip the rest of the loop and move to the next iteration
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even number: " + i); // This line will only print for even numbers
        }
		
	}
}