import java.util.Scanner;

public class Inclass_2024_10_15_ForLoopPrac {
	public static void main(String args[]){
		
		/*------------- 
		For loop practice
		--------------*/
		
		int OddSum = 0;
		for(int i =1;i<=100;i = i+2){
			OddSum = OddSum + i;
			System.out.printf("The sum of the odd =%d. i = %d \n",OddSum,i);
			System.out.println("-----");
		}
		
		System.out.printf("The final sum of the odd from 0 to 100 =%d \n",OddSum);
		
		System.out.println("==========");
		
		int EvenSum = 0;
		for(int i =2;i<=100;i = i+2){
			EvenSum = EvenSum + i;
			System.out.printf("The sum of the even =%d. i =%d \n",EvenSum,i);
			System.out.println("-----");
		}
		
		System.out.printf("The final sum of the odd from 0 to 100 =%d \n",EvenSum);

		
	}
}