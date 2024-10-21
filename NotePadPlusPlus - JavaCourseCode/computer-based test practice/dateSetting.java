import java.util.Scanner;

public class dateSetting {
	public static void main(String args[]){
		
		/* Write a program that allows a user to enter a date range of days, 
		calculate the week corre56sponding to that number of days, 
		and format the result as “xx days equals x weeks and x days”. 
		In addition, based on the date range entered by the user, 
		count down the number of days until a specific event (e.g. a holiday or birthday).
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Please enter the number of days you want:");
		int inputDays = scanner.nextInt();
		
		int outputWeeks = inputDays / 7;
		int outputDays = inputDays % 7;
		
		System.out.printf("%d is %d week(s) and %d day(s) \n", inputDays, outputWeeks, outputDays);
		
	}
}