public class FinalExamPractice2_11_19 {
	
	/**
	*	Write a program that processes an integer array, 
	*	increases each element by 5, and determines the maximum and minimum values in the modified array.
	*	---
	*	Expected output :
		84;55;94;32;15;74;48;
		89;60;99;37;20;79;53;
		Max: 99 ; Min: 20
	* 	---
	*/
	
	public static void main(String[] args){
		int t[] = {84, 55, 94, 32, 15, 74, 48};
		System.out.print("Original List: \t");
		for (int i = 0; i < t.length ; i++){
			
			// Directly output the original list.
			System.out.printf("%d ；", t[i]);
		}
		System.out.println();
		increaseNum(t); // // Input the list "t" into the function.
		
	} 
	
	/**	Procress the nums in the list, and output it.
	*	Transfer the original list into the a[] list.
	*/
	
	public static void increaseNum(int a[]){ // remember to add the type of the parameter. int of a[].
		int max = a[0], min = a[0];
		System.out.print("Increased List: \t");
		for (int i = 0; i < a.length; i++){
			a[i] = a[i] + 5;
			if (a[i] > max){
				max = a[i];
			}else if (a[i] < min){
				min = a[i];
			}
			System.out.printf("%d ；", a[i]);
		}
		
		System.out.printf("\n Max : %d ; Min : %d \n", max, min);
	}
}