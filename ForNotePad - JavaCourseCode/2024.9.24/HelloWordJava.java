public class HelloWordJava {

        public static void main(String[] args) {
			
			Scanner = new Scanner(System.in);
			
			System.out.print("請輸入狗的數量：");
			int numOfDogs = scanner.nextInt();
			
			System.out.print("請輸入貓的數量：");
			int numOfCats = scanner.nextInt();
            
			int dog=2, cat=3;
			System.out.println("我們有" + numOfDogs + "隻狗");
			System.out.println("我們有" + numOfCats + "隻貓");
			System.out.println("我們共有" + (numOfDogs + numOfCats) + "隻寵物");
			
			scanner.close();
        }

}


	


