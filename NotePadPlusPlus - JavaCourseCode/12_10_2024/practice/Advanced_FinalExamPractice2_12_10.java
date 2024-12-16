import java.util.Scanner;

abstract class Shape{
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
	
	public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void show() {
        System.out.printf("Circle color : %s \n", color);
        System.out.printf("Circle Radius : %.2f \n", radius);
        System.out.printf("Circle Perimeter : %.2f \n", getPerimeter());
        System.out.printf("Circle Area : %.2f \n", getArea());
        System.out.println("---");
    }
}

class Rectangle extends Shape {
	double width, length;

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public void show() {
        System.out.printf("Rectangle color : %s \n", color);
        System.out.printf("Rectangle Width : %.2f \n", width);
        System.out.printf("Rectangle Length : %.2f \n", length);
        System.out.printf("Rectangle Perimeter : %.2f \n", getPerimeter());
        System.out.printf("Rectangle Area : %.2f \n", getArea());
        System.out.println("---");
    }
}

public class Advanced_FinalExamPractice2_12_10 {
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		Shape[] shapes = new Shape[10];
		int count = 0;
		
		while (true){
			System.out.println("Enter the type of shape (Circle or Rectangle) or 'exit' to stop:");
			String type = scn.next();
			
			if (type.equalsIgnoreCase("exit")){
				break;
			}
			
			if (type.equalsIgnoreCase("Circle")){
				System.out.printf("Enter radius: ");
				double radius = scn.nextDouble();
				Circle circle = new Circle(radius);

				System.out.printf("Enter color: ");
				String color = scn.next();
				circle.setColor(color);
				
				shapes[count++] = circle;
				
			} else if (type.equalsIgnoreCase("Rectangle")){
				System.out.printf("Enter width: ");
				double width = scn.nextDouble();
				System.out.printf("Enter length: ");
				double length = scn.nextDouble();
				Rectangle rectangle = new Rectangle(width, length);
				
				System.out.printf("Enter color: ");
				String color = scn.next();
				rectangle.setColor(color);
				
				shapes[count++] = rectangle;
				
			} else {
				System.out.println("Invalid shape type. Please enter 'Circle' or 'Rectangle'.");
			}
			
			if (count >= shapes.length){
				System.out.println("Shape list is full. Cannot add more shapes.");
                break;
			}
		}
		
		System.out.println("\nShapes you entered:");
		for (int i = 0; i < count; i++){
			shapes[i].show();
		}
		
		/* Extra Practice */
		System.out.println("\n === Extra Practice:");
		int[][] test = 
            {{15, 16, 17, 8},
             {18, 19, 20, 25},
            };
			
        for (int i = 0; i < test.length; i++){
            for (int j = 0; j < test[i].length; j++){
                System.out.printf("%d,", test[i][j]);
            }
        }
		
		scn.close();
		
	}
	
}