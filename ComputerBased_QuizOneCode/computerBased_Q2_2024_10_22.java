import java.util.Scanner;

public class computerBased_Q2_2024_10_22{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		/* === Quiz topic 2 === */
		System.out.println("\n=== Quiz topic 2 ===");
		
		System.out.println("我是潘驄杰；學號：11144209");
		System.out.println("===========================================");
		
		System.out.printf("乘法表開始的整數：");
		int inputMulStart = scn.nextInt();
		System.out.println("");
		System.out.printf("乘法表結束的整數：");
		int inputMulEnd = scn.nextInt();
		System.out.println("");
		
		int OutputMulSum = 0;
		
		for(int i=inputMulStart;i<=inputMulEnd;i++){ 
			for(int j =inputMulStart;j<= inputMulEnd;j++){
					/*if inputMulStart > inputMulEnd then break for loop and print errror message */
					int instantVlaue = i*j;
					System.out.printf("%d*%d=%d; \t",i,j,instantVlaue);
					OutputMulSum  += instantVlaue;	
			}
			System.out.println("");
		}
		System.out.printf("\n === 所有乘積加總:%d",OutputMulSum);
		
	}
}