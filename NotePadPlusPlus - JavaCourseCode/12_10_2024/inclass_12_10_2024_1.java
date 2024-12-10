abstract class Shape{
	String color;
	public void setColor(String c){
		
		color = c;
		
	}
	
	// If use the abstract, the class must use abstract too.
	public abstract void show(); 
}

class Circle extends Shape{
	double radius;
	double pi = 3.1415926;
	public Circle(double r){
		radius = r;
	}
	public void show(){
		System.out.printf("Circle Color : %s \n", color);
		System.out.printf("Circle Radius : %.2f \n", radius);
		System.out.printf("Circle Area : %.2f \n", pi*radius*radius);
	}
}

class Rectangle extends Shape{
	double height, width;
	public Rectangle(double h, double w){
		height = h;
		width = w;
	}
	public void show(){
		System.out.printf("Rectangle Color : %s \n", color);
		System.out.printf("Rectangle Height : %.2f \n", height);
		System.out.printf("Rectangle Width : %.2f \n", width);
		System.out.printf("Rectangle Area : %.2f \n", height * width);
	}
}
public class inclass_12_10_2024_1{
	public static void main(String args[]){
		Circle obj1 = new Circle(3.6);
		obj1.setColor("Yellow");
		obj1.show();
		
		Rectangle obj2 = new Rectangle(5,6);
		obj2.setColor("Orange");
		obj2.show();
	}
}
