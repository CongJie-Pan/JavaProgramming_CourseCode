import java.util.Random;
import java.util.ArrayList;

public class Inclass_2024_10_29 {
	public static void main(String args[]){
		// int score[] = new int[5];
		/*
		int[] score = new int[5];
		for(int i=0;i<5;i++){
			score[i] = i + 101;
		}
		
		for(int i=0;i<5;i++){
			System.out.printf("Score position %d has value %d \n",i,score[i]);
		}
		*/
		
		Random rnd = new Random();
        int arr[] = new int[6];
		
		// 填充隨機數到陣列中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);  // 生成 0 到 99 的隨機數
        }

        // 輸出陣列中的數字
        System.out.print("Array values: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();  // 換行

        // 尋找最大值和最小值，並分類偶數和奇數
        int max = arr[0], min = arr[0], sum = 0;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];

            // 偶數與奇數分類
            if (arr[i] % 2 == 0) {
                evenNumbers.add(arr[i]);  // 加入偶數列表
            } else {
                oddNumbers.add(arr[i]);   // 加入奇數列表
            }
        }

        // 輸出最大值和最小值
        System.out.printf("Max: %d\n", max);
        System.out.printf("Min: %d\n", min);
        System.out.printf("Sum: %d\n", sum);

        // 列出所有偶數
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        // 列出所有奇數
        System.out.print("Odd numbers: ");
        for (int num : oddNumbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();
		
	}
}