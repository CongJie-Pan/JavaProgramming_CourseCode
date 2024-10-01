public class printfPractice {

        public static void main(String[] args) {
			
			// %n for newline
			System.out.printf("Name :%s; %n Age: %d %n","John",30);
			
			// \n for newline
			// the minus symbol(e.g. %-10s) means move front the word；the plus symbol(e.g. %10d) means move back to the word
			System.out.printf("Name :%-10s; \n Age: %10d %n","John",30);
			
			System.out.printf("Height:%10.1f", 172.455555555); // %f : To one decimal place
        }

}


	


