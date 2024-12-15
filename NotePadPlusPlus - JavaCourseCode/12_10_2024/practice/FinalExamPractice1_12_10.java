/** abstract : It may be difficult to set categories at first, 
*	so set variables for later people or subcategories.
*/

import java.util.Scanner;

abstract class Shape {
	String color;
	public void setColor(String c){
		color = c;
	}
	
	// If use the abstract, the class must use a abstract too.
	public abstract void show();
}

class Circle extends Shape {
	double radius;
	
	public Circle(){
		radius = 2.0;
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
		System.out.printf("Circle color : %s \n", color);
		System.out.printf("Circle Radius : %.2f \n", radius);
		System.out.printf("Circle Perimeter : %.2f \n",getPerimeter());
		System.out.printf("Circle Area : %.2f \n",getArea()) ;
		System.out.println("---");
	}
	
}

class Rectangle extends Shape {
	double width, length;
	
	public Rectangle(){
		width = 3.0;
		length = 4.0;
	}
	
	public Rectangle(double w, double l){
		width = w;
		length = l;
	}
	
	public double getArea(){
		return width * length;
	}
	
	public double getPerimeter(){
		return (width + length) * 2;
	}
	
	public void show(){
		System.out.printf("Rectangle color : %s \n", color);
		System.out.printf("Rectangle Width : %.2f \n", width);
		System.out.printf("Rectangle Length : %.2f \n", length);
		System.out.printf("Rectangle Area : %.2f \n", getArea());
		System.out.printf("Rectangle Perimeter : %.2f \n", getPerimeter());
		System.out.println("---");
	}
}

public class FinalExamPractice1_12_10 {
	public static void main(String[] args){
		
		Circle[] obj1 = new Circle[3];
		Rectangle[] obj2 = new Rectangle[4];
		
		obj1[0] = new Circle();
		obj1[1] = new Circle(3.6);
		obj1[2] = new Circle(4.8);
		
		obj2[0] = new Rectangle();
		obj2[1] = new Rectangle(5.0, 6.0);
		obj2[2] = new Rectangle(8.0, 9.0);
		obj2[3] = new Rectangle(10.0, 13.0);
		
		for (int i = 0; i < obj1.length; i++){
			obj1[i].setColor("Yellow");
			obj1[i].show();
		}
		
		System.out.println("==========");
		
		for (int i = 0; i < obj2.length; i++){
			obj2[i].setColor("Yellow");
			obj2[i].show();
		}
		
	}
}