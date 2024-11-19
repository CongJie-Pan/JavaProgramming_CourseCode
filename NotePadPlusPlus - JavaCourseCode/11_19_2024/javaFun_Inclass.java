public class javaFun_Inclass {
	public static void main(String[] args){
		star();
		star(10);
		square(5);
		int ans = square(8);
		System.out.printf("%d, Square = %d \n",8, ans);
	}
	
	public static int square(int n){ 
		return n*n;
		
	}
	
	public static void star(){
		for (int i=1; i<50; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void star(int n){
		for (int i=1; i<50; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
