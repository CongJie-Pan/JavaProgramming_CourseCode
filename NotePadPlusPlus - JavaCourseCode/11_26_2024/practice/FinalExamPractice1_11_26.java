class Circle{
	double radius;
	double pi = 3.1415926;
	
	// Defalut radius value
	void setData(){ // Set Data is a behavior, not to return value, so use "void".
		radius = 2.0;
	}
	
	// Custom radius value
	void setData(double r){
		radius = r;
	}
	
	double getArea(){
		return pi * radius * radius;
	}
	
	double getPerimeter(){
		return 2 * pi * radius;
	}
	
	void showResult(){
		System.out.printf("Radius = %.2f \n", radius);
		System.out.printf("Area = %.2f \n", getArea());
		System.out.printf("Perimeter = %.2f \n", getPerimeter());
	}
	
}

class Rect{
	private double width, length;
	
	// Defalut radius value
	public Rect(){
		width = 3.0;
		length = 4.0;
	}
	
	// Custom radius value
	public Rect(double w, double l){
		width = w;
		length = l;
	}
	
	double getArea(){
		return width * length;
	}
	
	double getPerimeter(){
		return (width + length) * 2;
	}
	
	void showResult(){
		System.out.printf("Width = %.2f \n", width);
		System.out.printf("Length = %.2f \n", length);
		System.out.printf("Area = %.2f \n", getArea());
		System.out.printf("Perimeter = %.2f \n", getPerimeter());
	}
	
}

public class FinalExamPractice1_11_26 {
	/**	Use object to perfrom the result below: 
	*	---
	*	Expected output:
	*	c1 information
		Area = 105.68 
		Perimeter = 36.44 
		c2 information
		Area = 12.57 
		Perimeter = 12.57
	*	---
	*/
	
	public static void main(String[] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		// Defalut Radius Value (Defalut Constructor)
		c1.setData();
		System.out.println("c1 information: ");
		c1.showResult();
		System.out.println("---");
		
		// Custom Radius value (Parameter Constructor)
		c2.setData(10.0);
		System.out.println("c2 information: ");
		c2.showResult();
		System.out.println("---");
		
		Rect r1 = new Rect();
		
		// Defalut Constructor
		System.out.println("r1 information: ");
		r1.showResult();
		System.out.println("---");
		
		// Parameter Constructor
		Rect r2 = new Rect(15.0,11.5);
		System.out.println("r2 information: ");
		r2.showResult();
		System.out.println("---");
	}
}