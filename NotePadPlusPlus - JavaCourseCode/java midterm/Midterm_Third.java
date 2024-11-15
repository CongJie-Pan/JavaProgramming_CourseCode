import java.util.Arrays;

public class Midterm_Third {
	public static void main(String[] args){
		
		/* Calculate individual average sales and quarterly average sales 
           for three salespeople over four quarters with tabular type
		   ---
		   When calculating loop lengths, you should use array lengths instead of 
		   hard-coding numbers. This creates adaptive code that can handle arrays 
		   of different sizes. For example, use mainClassics.length instead of 
		   manually typing a number.
		   
		   Also, it's good practice to write comments first to outline your code structure,
		   just like creating an outline before writing an essay.
		*/
		
		String[] mainClassics = {"Season1", "Season2", "Season3", "Season4", "Avg"};
		String[] salesName = {"John", "Amy", "Michael"};
		int[][] salesData = {
			{195, 247, 235, 323},
			{186, 290, 375, 242},
			{298, 198, 296, 222},
		};
		// John: 0,0 ; 0,1; 0,2; 0,3
		// Amy:  1,0 ; 1,1; 1,2; 1,3
		// Mich: 2,0 ; 2,1; 2,2; 2,3
		
		/* === Print out the first title === */
		for(int i = 0; i < mainClassics.length; i++){
			System.out.printf(" \t %s",mainClassics[i]);
		}
		System.out.println("");
		System.out.printf("=".repeat(50));
		System.out.println("");
		
		/* === Print out the second title === */
		// The Name Layer
		for(int i = 0; i < salesName.length; i++){
			System.out.printf("%s \t",salesName[i]);
			
			int sum = 0;
			
			// The data export layer
			for(int j = 0; j < 4; j++){
				System.out.printf("%d \t",salesData[i][j]);
				sum +=  salesData[i][j];
			}
			
			System.out.printf("%.2f \t", (float)sum /4 );
			
			System.out.println("");
			
		}
		
		/* === Print out the third layer === */
		System.out.printf("-".repeat(90));
		System.out.print("\n AVG ");
		
		// Calculate and print average for each quarter
		for(int i =0;i < 4 ; i++){
			int quarterTotoal = 0;
			for(int j=0; j < salesName.length; j++){ // Changed to salesName.length
				quarterTotoal += salesData[j][i];
			}
			double quarterAverage = (double)quarterTotoal / salesName.length;
			System.out.printf("\t%.2f", quarterAverage);
		}
		System.out.println();
	}
}