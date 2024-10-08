import java.util.Scanner;

public class weekDayCalc{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the days you want:");
		
		int inputDays = scanner.nextInt();
		
		int weeks = inputDays / 7;
		
		int days = inputDays % 7;
		
		System.out.printf("%d days equal to %d weeks and %d days",inputDays,weeks,days);
		
	}
}
