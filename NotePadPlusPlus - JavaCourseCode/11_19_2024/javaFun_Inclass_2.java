public class javaFun_Inclass_2 {
	
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
