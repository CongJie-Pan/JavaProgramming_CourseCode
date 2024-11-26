class Circle {
    double pi = 3.1416;
    double radius;
    
    // 計算面積
    double getArea(){
        return pi * radius * radius;
    }
    
    // 計算周長
    double getPerimeter(){
        return 2 * pi * radius;
    }
    
    // 設定半徑為預設值 1.0
    void setData(){
        radius = 1.0;  // 修正：應該是 radius，而不是 width 和 length
    }
    
    // 設定指定的半徑值
    void setData(double r){  // 修正：Circle 只需要一個參數 radius
        radius = r;
    }
    
    // 顯示面積和周長
    void show(){
        System.out.printf("Area = %.2f \n", getArea());
        System.out.printf("Perimeter = %.2f \n", getPerimeter());
    }
}

class Rect {
	private double width, length;
	
    public Rect(){
		//width = 1.0;
		//length = 1.0;
		this(2.0,2.0);
	}
	
	/*Overloading*/
	public Rect(double w, double l){
		width = w;
		length = l;
	}
	
    // 計算面積
    double getArea(){
        return width * length;
    }
    
    // 計算周長
    double getPerimeter(){
        return 2*(width + length);
    }
	
	void show(){
		System.out.printf("Width = %.1f, Length = %.1f\n", width, length);
        System.out.printf("Area = %.2f \n", getArea());
        System.out.printf("Perimeter = %.2f \n", getPerimeter());
    }
	
}
public class Test {
    public static void main(String args[]){
		
		/*
        Circle c1 = new Circle();
        c1.radius = 3.5;
        
        Circle c2 = new Circle();  // 需要先宣告 c2
        
        c1.setData();      // c1 的半徑會被設為 1.0
        c2.setData(5.8);   // c2 的半徑會被設為 5.8
        
        System.out.println("c1 的資訊：");
        c1.show();
        System.out.println("c2 的資訊：");
        c2.show();
		*/
		
		// 使用無參數建構子（預設 1.0 x 1.0）
        Rect r1 = new Rect();
        System.out.println("=== r1 (使用預設建構子) ===");
		r1.show();
		/*
        System.out.printf("Width = %.1f, Length = %.1f\n", r1.width, r1.length);
        System.out.printf("Area = %.1f\n", r1.getArea());
        System.out.printf("Perimeter = %.1f\n", r1.getPerimeter());
		*/
        
        // 使用有參數建構子
        Rect r2 = new Rect(2.5, 3.0);
        System.out.println("\n=== r2 (使用參數建構子) ===");
		r2.show();
		/*
        System.out.printf("Width = %.1f, Length = %.1f\n", r2.width, r2.length);
        System.out.printf("Area = %.1f\n", r2.getArea());
        System.out.printf("Perimeter = %.1f\n", r2.getPerimeter());
		*/
		
		
		
		
    }
}