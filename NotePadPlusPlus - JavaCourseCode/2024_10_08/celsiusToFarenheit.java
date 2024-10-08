import java.util.Scanner;

public class celsiusToFarenheit {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the Celsius temperature:");
		
		double inputCelsius = scanner.nextDouble();
		
		double resultFahrenheit = ((9.0/5.0) * inputCelsius) + 32 ;
		
		System.out.printf("Celsius: %.1f \n",inputCelsius);
		
		System.out.printf("Fahrenheit: %.1f \n",resultFahrenheit);
	}
}
