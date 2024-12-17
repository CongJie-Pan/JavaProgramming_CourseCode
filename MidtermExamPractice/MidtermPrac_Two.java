import java.util.Scanner;
import java.util.Arrays;

public class MidtermPrac_Two {
    public static void main(String args[]) {
		
		/*
		
		The user need to enter the students numbers, names, and enter the grades for each subjects.
		And use the user given array of students' scores across various subjects, calculate:
		1. The total score and average for each student across all subjects.
		2. The average score for each subject across all students.
		---
		The expected output:
		
		- Suppose the terminal is like:
		-> Please enter the student number you want:
		-> The Student 1 name : 
		-> The Student 1 Chinese score :
		-> The Student 1 English score :
		-> The Student 1 Math score :
		---
		-> The Student 2 name : 
		-> The Student 2 Chinese score :
		-> The Student 2 English score :
		-> The Student 2 Math score :
		...
		
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
		
        Scanner scanner = new Scanner(System.in);

        // Define subjects names and count of students and subjects
		String[] subjects = {"Chinese", "English", "Math"};
		String[] subjectsAndCount = {"Chinese", "English", "Math", "Total", "Average"};
		
		// Set the variables of the higest score
		int highestTotalScore = 0;
		int studentsInd = 0; // The highest total score student index
		
		// Prompt for the number of students
		System.out.print("Please enter the number of students: ");
		int numStudents = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
		
		// Define arrays for storing student names and grades
		String[] studentsName = new String[numStudents];
		double[][] studentsGrade = new double[numStudents][subjects.length];
		
		// Get student names and scores
		
			// First layer : enter the students' names
			for (int i = 0 ; i < numStudents; i++){
				System.out.println("---");
				System.out.print("Enter the names of student " + (i + 1) + " :");
				studentsName[i] = scanner.nextLine();
				
				// Second layer : enter the students' grades
				for(int j = 0; j < subjects.length ; j++){
					System.out.print("Enter the "+ subjects[j] + " scroe for "+ studentsName[i] + " :");
					studentsGrade[i][j] = scanner.nextDouble();
				}
				scanner.nextLine(); // Consume the new line character 
			}
			

        /// Print out the first layer of the subjects and divider(===)
			
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
					
					averageEachStudent = (double) totalEachStudent / studentsGrade[i].length;
					System.out.printf("\t %d \t %.2f",totalEachStudent, averageEachStudent);
					System.out.println();
					
				}
				
				// The Divider (-)
				System.out.println("-".repeat(90));
			
			// Print out the Final average score of each subjects
			// >>> `j` is the row index (student) and `i` is the column index (subject) in `studentsGrade`.<<<
			
				System.out.print("Average ");  // Print the label for the averages row
			
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
			
        scanner.close();
    }
}
