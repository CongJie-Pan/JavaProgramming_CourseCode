public class javaFun_Inclass_3 {
    
    public static void main(String args[]){
        Rect r1 = new Rect();
        r1.width = 5;
        r1.height = 10;
        System.out.printf("	Rect : Area = %d, Perimeter = %d \n", r1.area(), r1.perimeter());  // 需要加上()
		
		Circle c1 = new Circle();
        c1.radius = 10;
        System.out.printf("Circle : Area = %.2f, Perimeter = %.2f \n", c1.area(), c1.perimeter());  // 需要加上()
    }
    
    static class Rect{  // 需要加上 static
        int width, height;
        
        public int area(){
            return width*height;
        }
        
        public int perimeter(){  // 移除參數，因為 width 和 height 已經是類的成員變數
            return 2*(width+height);
        }
    }
	
	static class Circle{  // 需要加上 static
        double radius;
        
        public double area(){
            return radius * radius *3.14;
        }
        
        public double perimeter(){  // 移除參數，因為 width 和 height 已經是類的成員變數
            return 2*3.14*radius;
        }
    }
}