/** 考試時要注意之處:
*	1. 寫完一段，檢查一次。
*	2. 先理解題意(不懂要舉手問)，再列大綱，進而填寫裡面的內容。
*	3. 有出錯就看看是否是字打錯問題，盡量用自動選字功能。
*	4. 變數名稱要一致，不要頻繁改動。
/*---*/

/* 提醒： 只要是類別就要加class */
abstract class Shape {
	String color;
	
	/* Because it's a function without return value, use void.  */
	public void setColor(String c){
		color = c;
	} 
	
	public abstract void show();
}


class Circle extends Shape { 
    /* Why can not add public, like public class ?  When to add public ?*/
    /* 當該類別需要公開給其他檔案使用時便使用public。通常一個檔案只能有一個 public class，其他類別應該是預設的包級別存取（package-private）。*/
    /* 在 Java 中，一個 .java 檔案中最多只能有一個 public 類別，並且這個類別的名稱必須與檔案名稱一致。*/
    
	double radius ;

    /* 而類別內的 public 方法或欄位，不受此限制，用於定義類別的公共接口。
    它們的可見性取決於類別本身的可見性（例如：如果 Circle 是包級別，public 成員只在同一個包內可用）。
    */
  
    /* 以下public Circle()為建構子(constructor)，不是類別(class)，並依據 Java 的語法規定，類別的宣告不能加括號 () */
    
    /* 類別和建構子的定義。
      - 類別：用來描述物件的結構和行為。
      e.g. 
        class Circle {
          // 類別的成員變數和方法
        }
      - 建構子：用來初始化類別的物件。
      e.g.
        public Circle() {
          // 初始化物件的屬性
        }
      */
  
	public Circle(){ 
		radius = 2.0;
	}
	
	public Circle(double r){
		radius = r;
	}
	
	public double getArea(){ /* Because it return value, use double */
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public void show(){
		System.out.printf("Circle Color: %s \n", color); /* Why "Shape" function parameter can directly use in here ?*/
		/* 因為color 是定義在父類別 Shape 中的屬性。Circle 繼承了 Shape，因此自動擁有 color 屬性。 */
        System.out.printf("Circle Radius: %.2f \n", radius);
		System.out.printf("Circle Perimeter: %.2f \n", getPerimeter());
		System.out.printf("Circle Area: %.2f \n", getArea());
		System.out.println("---");
	}
}

class Rectangle extends Shape { 
	/* Why appears the error below ?*/
	/* public class Rectangle extends Shape {
       ^
		1 error  
		class Rectangle is public, should be declared in a file named Rectangle.java
		public class Rectangle extends Shape {
	*/
    /* 如果類別宣告為 public，則該類別的名稱必須與檔案名稱完全一致。
      在這個程式中，檔案名稱是 FinalExamPractice1_12_10.java。
      所以只有 FinalExamPractice1_12_10 可以是 public。*/
	
	double width, length ;
	
	public Rectangle(){
		width = 2.0;
		length = 3.0;
	}
	
	public Rectangle(double w, double l){
		width = w;
		length = l;
	}
	
	public double getArea(){ 
		return width * length;
	}
	
	public double getPerimeter(){
		return 2 * (width + length);
	}
	
	public void show(){
		System.out.printf("Rectangle Color: %s \n", color);
		System.out.printf("Rectangle Width: %.2f \n", width);
		System.out.printf("Rectangle Length: %.2f \n", length);
		System.out.printf("Rectangle Perimeter: %.2f \n", getPerimeter());
		System.out.printf("Rectangle Area: %.2f \n", getArea());
		System.out.println("---");
	}
}


public class FinalExamPractice1_12_10 {
	
	public static void main (String[] args){
		
		Circle[] object1 = new Circle[3];
		Rectangle[] object2 = new Rectangle[4];
		
		object1[0] = new Circle();
		object1[1] = new Circle(5.8);
		object1[2] = new Circle(6.7);
		
		object2[0] = new Rectangle();
		object2[1] = new Rectangle(5.7, 9.7);
		object2[2] = new Rectangle(9.4, 4.7);
		object2[3] = new Rectangle(10.0, 11.0);
		
		for (int i = 0; i < object1.length; i++){
			object1[i].setColor("Yellow");
			object1[i].show();
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < object2.length; i++){
			object2[i].setColor("Orange");
			object2[i].show();
		}
		
	}
	
	
}
