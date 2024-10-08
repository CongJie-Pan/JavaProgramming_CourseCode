import java.util.Scanner;

public class numberIfStatement {
	
	/* Input Number , If 5 and 6 can be divisible, 
	then it will show that it can be divisible by 5 and 6, if not, 
	then it will show that it can not be divisible by 5 and 6. */
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		double inputNum = scanner.nextDouble();
		
		if((inputNum % 5 == 0) && (inputNum % 6 == 0) ){
			System.out.printf("%.2f can be divided by both 5 and 6 \n", inputNum);
		}
		else{
			System.out.printf("%.2f can not be divided by both 5 and 6 \n", inputNum);
		}
		
	}
}
