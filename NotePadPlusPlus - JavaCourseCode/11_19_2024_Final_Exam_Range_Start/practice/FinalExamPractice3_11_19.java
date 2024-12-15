public class FinalExamPractice3_11_19 {
	
	/** Use object to calculate the Rectangle and Cicrle Value
	*	---
	* 	Expected Output:
		[Rect] Width : 5, Height : 10；Area = 50, Perimeter = 30 
		[Circle] Radius : 10.00 ； Area = 314.00, Perimeter = 62.80
	*	---
	*/
	
	/** 
	* In Java, 
	* static means that the member (method, variable, or internal class) belongs to the class itself, 
	* not to a specific object instance. 
	* Therefore, static members can be used directly through the class name without creating an object. 
	* Non-static members are associated with object instances and must be accessed through instances of the class. 
	* Furthermore, static members cannot directly access non-static members because they do not depend on any instance.
	* Static applies to tool classes, general logic, or functionality independent of object state.
	* ---
	* Need to understand more about static
	* ---
	*/
	
	public static void main(String[] args){
		Rect r1 = new Rect();
		r1.width = 5;
		r1.height = 10;
		System.out.printf("[Rect] Width : %d, Height : %d；Area = %d, Perimeter = %d \n", r1.width, r1.height, r1.area(), r1.perimeter());
		
		Circle c1 = new Circle();
		c1.radius = 10;
		System.out.printf("[Circle] Radius : %.2f；Area = %.2f, Perimeter = %.2f \n", c1.radius, c1.area(), c1.perimeter());
	}
	
	static class Rect{ // When defining a class, parentheses "()" are not allowed, e.g., "static class Rect() {}" is illegal.
		int width, height;
		
		public int area(){
			return width * height;
		}
		
		public int perimeter{
			return (width + height) * 2;
		}
		
	}
	
	static class Circle(){
		double radius;
		
		public double area(){
			return 3.14 * radius * radius;
		}
		
		public double perimeter(){
			return 2 * 3.14 * radius;
		}
	}
}