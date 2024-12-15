public class javaFun_Inclass_2 {
	
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
	
	public static void main(String args[]){
		
		int t[] = {84, 55, 94, 32, 15, 74, 48};
		for(int i=0; i<t.length; i++){
			System.out.printf("%d;", t[i]);
		}
		System.out.println();
		max_min(t);
		
	}
	
	public static void max_min(int a[]){
		int max=a[0],min=a[0];
		for(int i=0; i<a.length; i++){
			a[i] = a[i]+5;
			if(a[i]>max){
				max = a[i];
			}else if(a[i]<min){
				min = a[i];
			}
			
			System.out.printf("%d;",a[i]);
		}
		System.out.printf("\n Max:%d ; Min:%d \n",max, min);
		
	}
	
	
}
