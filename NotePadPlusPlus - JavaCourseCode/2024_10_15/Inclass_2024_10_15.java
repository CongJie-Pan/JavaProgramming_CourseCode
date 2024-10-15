import java.util.Scanner;

public class Inclass_2024_10_15 {
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		/*------------- 
		ternary operator using 
		--------------*/
		
		System.out.printf("Please enter an integer number:");
		int inputA = scn.nextInt();
		
		System.out.printf("Please enter another integer number:");
		int inputB = scn.nextInt();
		
		/*
		if(a>b){
			System.out.printf("%d is bigger than %d ",b,a);
		}
		else{
			System.out.printf("%d is bigger than %d",a,b);
		}
		*/
		
		// Using tthe ternary operator to assign the bigger value to x
		int x = (inputA > inputB) ? inputA:inputB ;
		System.out.printf("Between %d and %d, %d is bigger\n",inputA,inputB,x);
		
		System.out.println("========================");
		
		/*------------- 
		Grade distribution 
		--------------*/
		
		System.out.printf("Please enter your chinese score:");
		double inputScore = scn.nextDouble();
		
		if(inputScore >= 90){
			System.out.printf("You got Grade A\n");
		}
		else if(inputScore < 90 && inputScore >= 80){
			System.out.printf("You got Grade B\n");
		}
		else if(inputScore < 80 && inputScore >= 70){
			System.out.printf("You got Grade C\n");
		}
		else if(inputScore < 70 && inputScore >= 60){
			System.out.printf("You got Grade D\n");
		}
		else if(inputScore < 60){
			System.out.printf("You failed.\n");
		}
		
		System.out.println("========================");
		
		/*------------- 
		Month Select
		--------------*/
		
		System.out.printf("Please enter a month:");
		int inputMonth = scn.nextInt();
		
		switch(inputMonth){
			case 12:
			
			case 1:
			
			case 2:
				System.out.println("Winter\n");
				break;
				
			case 3:
				
			case 4:
				
			case 5:
				System.out.println("Spring\n");
				break;
				
			case 6:
			
			case 7:
			
			case 8:

			case 9:
				System.out.println("Summer\n");
				break;
				
			case 10:
			
			case 11:
				System.out.println("Fall\n");
				break;
		}
		
		/*------------- 
		For loop practice
		--------------*/
		
		int sum = 0;
		for(int i =1;i<=100;i = i+2){
			sum = sum + i;
			System.out.printf("Sum=%d \n",sum);
		}
		
		scn.close();

		
	}
}