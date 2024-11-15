import java.util.Scanner;

public class temperatureSetting {
	public static void main(String atgs[]){
		
		/* Design a temperature conversion program that allows the user to input a temperature in Celsius, 
		the program will automatically convert it to Fahrenheit, 
		and give appropriate suggestions based on the temperature range entered, 
		e.g., “It is cold, please keep warm” or “The weather is moderate”. When inputting temperature, 
		it is also necessary to check whether the user's input is valid, 
		e.g. no non-numeric or out-of-range temperatures (e.g. values below -273.15°C).
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Please enter the Celsius temperature: ");
		double inputCelsius = scanner.nextDouble();
		double outputFahrenheit = (inputCelsius * (9.0/5.0)) + 32;
		String outputSuggestion = new String();
		
		if (outputFahrenheit <= 32) {
			outputSuggestion = "Very cold and may be icy, please wear heavy warm clothing and avoid spending long periods of time outdoors.";
		} else if (outputFahrenheit > 32 && outputFahrenheit <= 50){
			outputSuggestion = "Please wear a winter jacket and keep warm as the weather is cold.";
		} else if (outputFahrenheit > 50 && outputFahrenheit <= 85) {
			outputSuggestion = "The weather is moderate and comfortable enough to wear normal everyday clothes.";
		} else {
			outputSuggestion = "Wear breathable clothing and stay hydrated in hot weather.";
		}
		System.out.printf("It's now %.2f degrees in Farenheit. %s \n", outputFahrenheit, outputSuggestion);
		
		scanner.close();
		
	}
}