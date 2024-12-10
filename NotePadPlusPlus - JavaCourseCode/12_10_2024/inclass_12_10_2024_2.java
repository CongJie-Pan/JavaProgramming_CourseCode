interface Shape2D{
	public abstract void getArea();
	public abstract void getPerimeter();
}

// To extend the "interface", need to use implements.
class Circle implements Shape2D{
	
	double radius;
	double pi = 3.1415926;
	public Circle(double r){
		radius = r;
	}
	
	public void getArea(){
		System.out.printf("Circle Radius : %.2f \n", radius);
		System.out.printf("Circle Area : %.2f \n", pi * radius * radius);
	}
	
	public void getPerimeter(){
		System.out.printf("Circle Perimeter : %.2f \n", 2 * pi * radius);
	}
}

class Rectangle implements Shape2D {
    double length, width;
    
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    public void getArea() {
        System.out.printf("Rectangle Area : %.2f \n", length * width);
    }
    
    public void getPerimeter() {
        System.out.printf("Rectangle Length: %.2f \n", length);
        System.out.printf("Rectangle Width: %.2f \n", width);
    }
}

public class inclass_12_10_2024_2{
	public static void main(String args[]){
		Circle obj1 = new Circle(3.6);
		obj1.getArea();
		obj1.getPerimeter();
		
		Rectangle obj2 = new Rectangle(5,6);
		obj2.getArea();
		obj2.getPerimeter();
	}
}
