import java.util.Arrays;

public class MidtermPrac_One {
	public static void main(String args[]){
		
		/*
		
		Using the given array of students' scores across various subjects, calculate:
		1. The total score and average for each student across all subjects.
		2. The average score for each subject across all students.
		---
		The expected output:
		
		- Suppose scores is:
		'''{ {78, 75, 88}, {85, 81, 70}, {88, 90, 78}, {77, 85, 89} }'''
		
		- The output should be like:
		          Chinese    English     Math       Total      Average
			============================================================
			John    78         75          88         241        80.33
			Amy     85         81          70         236        78.67
			Michael 88         90          78         256        85.33
			Iris    77         85          89         251        83.67
			----------------------------------------------------------------
			Average 82.00      82.75       81.25

		*/
		
		// ### Start the code ###
		
			// Define the array of the each student
				String studentsName[] = {"John" , "Amy", "Michael", "Iris"};
				int[][] studentsGrade = { 
					{78, 75, 88},  // Grades for John
					{85, 81, 70},  // Grades for Amy
					{88, 90, 78},  // Grades for Michael
					{77, 85, 89},   // Grades for Iris
				};
				String subjectsAndCount[] = {"Chinese", "English", "Math", "Total","Average"};
				int highestTotalScore = 0;
				int studentsInd = 0; // The highest total score student index
			
			// Print out the first layer of the subjects and divider(===)
			
				for(int i = 0; i < subjectsAndCount.length; i++){
					System.out.printf("\t %s",subjectsAndCount[i]);
				}
				System.out.println();
				
				// The Divider (=)
				System.out.println("=".repeat(50));
			
				//System.out.println(Arrays.toString(studentsName));
			
			// Seperately print out the students' grade, total score and average socre. Finally print out the devider(---)
			
				// Print the students name in the first layer
				
				for(int i = 0; i < studentsName.length ; i++ ){
					
					System.out.printf("%s",studentsName[i]);
					
					int totalEachStudent = 0;
					double averageEachStudent = 0;
					
					// Print the grade, total and average in the second layer
					for(int j = 0; j < studentsGrade[i].length; j++){

						System.out.printf("\t %s",studentsGrade[i][j]);
						totalEachStudent += studentsGrade[i][j];
						
					}
					if(highestTotalScore < totalEachStudent){
						highestTotalScore = totalEachStudent;
						studentsInd = i;
					}
					
					averageEachStudent = (double) totalEachStudent / (double) studentsGrade[i].length;
					System.out.printf("\t %d \t %.2f",totalEachStudent, averageEachStudent);
					System.out.println();
					
				}
				
				// The Divider (-)
				System.out.println("-".repeat(90));
			
			// Print out the Final average score of each subjects
			// >>> `j` is the row index (student) and `i` is the column index (subject) in `studentsGrade`.<<<
			
				System.out.print("Average   ");  // Print the label for the averages row
			
				// The first layer of the each subject
					
					for(int i = 0; i < subjectsAndCount.length - 2; i++){ // Skip Total and Average columns with "-2"
						
						int subjectTotal = 0;
						
						// The second layer of accumulating scores for each subject across all students
							
							for(int j = 0 ; j < studentsName.length; j++){
								subjectTotal += studentsGrade[j][i];
							}
						
						// Calculate average for each subject
						double subjectAverage = (double) subjectTotal / studentsName.length;
						System.out.printf("\t %.2f", subjectAverage);
						
					}
					
			// Print out the highest score student
			System.out.printf("\n The highest score student is %s who gets %d \n", studentsName[studentsInd], highestTotalScore);
			
		// ### End the code
		
	}
}