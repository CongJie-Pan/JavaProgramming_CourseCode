import java.util.Scanner;

public class computerBased_Q1_2024_10_22{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		/* === Quiz topic 1 === */
		System.out.println("=== Quiz topic 1 ===");
		
		System.out.println("我是潘驄杰；學號：11144209");
		System.out.println("===========================================");
		
		System.out.printf("請輸入開始的整數：");
		int inputStart = scn.nextInt();
		System.out.println("");
		System.out.printf("請輸入結束的整數：");
		int inputEnd = scn.nextInt();
		System.out.println("");
		
		int OutputSum = 0;
		
		for(int i=inputStart;i<=inputEnd;i++){
			if (i % 3 == 0){
				System.out.printf("%d;",i);
				OutputSum += i;
			}
		}
		System.out.printf("\n Total:%d",OutputSum);
		
	}
}