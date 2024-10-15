import java.util.Scanner;

public class Inclass_2024_10_15_NestedLoop {
	public static void main(String args[]){
		
		/*------------- 
		Nested loop practice
		--------------*/
		
		/* 9*9 Multplication Table */
		
		System.out.println("========= 9*9 Multplication Table =========");
		
		for (int i=1;i<=9;i++){
			for (int j=1;j<=9;j++){
				System.out.printf("%d * %d = %d ; \t ", i,j ,(i*j));
			}
			System.out.println("");
		}
		
		// -------
		
		System.out.println("========= Drawing Triangle =========");
		
		for (int i = 1; i<= 9; i++){
				for (int j = 1; j <= i ; j++){
					System.out.printf("*");
				}
			//System.out.printf("i=%d,j=%d",i,j);
			System.out.println("");
		}
		//System.out.printf("i=%d,j=%d",i,j);
		
		System.out.println("========= Drawing Triangle =========");
		
		for (int i = 1; i<= 9; i++){
				for (int j = 1; j <= 10-i ; j++){
					System.out.printf("*");
				}
			System.out.println("");
		}

		
	}
}