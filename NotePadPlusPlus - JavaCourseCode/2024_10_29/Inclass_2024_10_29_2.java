public class Inclass_2024_10_29_2 {
    public static void main (String args[]) {
        String name[] = {"John", "Amy", "Michael", "Iris"};
        String subject[] = {"Chinese", "English", "Math", "Total", "Average"};
        int score[][] = { {78, 75, 88}, {85, 81, 70}, {88, 90, 78}, {77, 85, 89} };

        // 1. print title
        for (int i = 0; i < subject.length; i++) {
            System.out.printf("\t %s", subject[i]);
        }
        System.out.println("\n==============================================");

        // 2. print the name and score content
		int highestScore = 0, ind = 0; // ind : the id number of the person
        for (int i = 0; i < score.length; i++) {

            int sum = 0;
            double average = 0;

            System.out.printf("%s \t", name[i]);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%d\t", score[i][j]);
            }
			if (highestScore < sum){
				highestScore = sum;
				ind = i;
			}

            // 計算每個學生的總分和平均分
            average = (double) sum / score[i].length;
            System.out.printf("%d\t", sum);   // 輸出總分
            System.out.printf("%.2f\t", average);  // 輸出平均分
            System.out.println();
        }

        System.out.println("-".repeat(82));
		System.out.printf("Average");

        // 3. Add column 計算每欄的平均值
        for (int i = 0; i < score[0].length; i++) {  // score[0].length 確保遍歷列
            int totalSum = 0;

            // 計算每欄的總和
            for (int j = 0; j < score.length; j++) {  // score.length 確保遍歷行
                totalSum += score[j][i];  // 加上每欄的值
            }

            // 計算每欄的平均值，學生數為 score.length
            double columnAverage = (double) totalSum / score.length;
            System.out.printf("\t %.2f", columnAverage);  // 輸出每欄的平均值
        }

        System.out.println();  // 換行
		System.out.printf("\n The highest score person is %s \n", name[ind]);
    }
}
