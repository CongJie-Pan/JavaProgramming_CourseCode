import java.util.Scanner;

abstract class Shape {
	String color;
	
	public void setColor(String c){
		color = c;
	}
	
	public abstract void show();
	
}

class Circle extends Shape {
	double radius;
	
	public Circle(){
		radius = 3.0;
	}
	
	public Circle(double r){
		radius = r;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public void show(){
		System.out.printf("Circle Color: %s \n", color);
		System.out.printf("Circle Radius: %.2f \n", radius);
		System.out.printf("Circle Perimeter: %.2f \n", getPerimeter());
		System.out.printf("Circle Area: %.2f \n", getArea());
		System.out.println("---");
	}
}

class Rectangle extends Shape {
	double width, length;
	
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

public class Advanced_FinalExamPractice2_12_10 {
	
	static Scanner scn = new Scanner(System.in);
	static Shape[] shapes = new Shape[10];
	static int count = 0;
	
	public static void main(String[] args){
		
		while (true){
			String type = setShapeType();
			
			if (type.equalsIgnoreCase("exit")){
				break;
			}
			
			if (type.equalsIgnoreCase("Circle")){
				addCircle();
				
			} else if (type.equalsIgnoreCase("Rectangle")){
				addRectangle();
				
			} else {
				System.out.println("Invalid shape type. Please enter 'Circle' or 'Rectangle'.");
			}
			
			if (count >= shapes.length){
				System.out.println("Shape list is full. Cannot add more shapes.");
                break;
			}
			
		}
		
		displayShapes();
		
		scn.close();
		
	}
	
	static String setShapeType() {
		System.out.println("Enter the type of shape (Circle or Rectangle) or 'exit' to stop:");
		return scn.next();
	}
	
	static void addCircle() {
		System.out.println("Enter radius : ");
		double radius = scn.nextDouble();
		
		Circle circle = new Circle(radius);
		
		System.out.println("Enter color : ");
		String color = scn.next();
		circle.setColor(color);
		
		shapes[count++] = circle;
	}
	
	static void addRectangle() {
		System.out.println("Enter width : ");
		double width = scn.nextDouble();
		
		System.out.println("Enter length : ");
		double length = scn.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, length);
		
		System.out.println("Enter color : ");
		String color = scn.next();
		rectangle.setColor(color);
		
		shapes[count++] = rectangle;
	}
	
	static void displayShapes() {
		System.out.println("Shapes you entered: ");
		for (int i = 0; i < count; i++){
			shapes[i].show();
		}
	}
}