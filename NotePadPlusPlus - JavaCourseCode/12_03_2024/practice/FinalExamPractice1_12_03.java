/**
	1. Notice that class must to be set outside of the 'class of the file'.
	2. Notice the new way of below:
		Rect[] obj = new Rect[3];
		int count = 0;
		
		obj[0] = new Rect(); // Use the default value.
		obj[1] = new Rect(6.0, 9.5);
		obj[2] = new Rect(8.6, 7.9);
	3. Before compiling, check the code again.
*/

// In Java, class definitions cannot have parentheses '()' like 'class Rect()', 
// because '()' is used for method or constructor calls.
class Rect{ 
	double width, length;
	
	public Rect(){
		width = 5.0;
		length = 6.0;
	}
	
	public Rect(double w, double l){
		width = w;
		length = l;
	}
	
	public double getArea(){
		return width * length;
	}
	
	public double getPerimeter(){
		return (width + length) * 2;
	}
	
	// To show the width and length
	void getData(){
		System.out.printf("Rect \tLength = %.1f\n", length);
		System.out.printf("\tWidth = %.1f\n", width);
		System.out.println("\t---");
	}
	
	// To show the final result
	void showResult(){
		getData();// this.getData()
		System.out.printf("\tArea = %.1f\n", getArea());
		System.out.printf("\tPreimeter = %.1f\n", getPerimeter());
		System.out.println("=============================");
	}
}

class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void showResult() {
        System.out.printf("Circle: Radius = %.2f, Area = %.2f, Perimeter = %.2f\n",
                radius, getArea(), getPerimeter());
    }
}

class Coin extends Circle{
	double coinRadius;
	int value;
	
	// r for radius; v for value
	public Coin(double r, int v){
		super(r); // inherit object "Circle" of the radius.
		this.coinRadius = r;
		this.value = v;
	}
	
	public void getData(){
		System.out.printf("Radius %.2f of the Coin Value = %d \n", coinRadius, value);
	}
}

public class FinalExamPractice1_12_03{
	/** Use the array to store the object. As the expected output below.
	*	---
	*	Expected Output:
	*	Rect 	Length = 1.0
				Width = 1.0
				---
				Area = 1.0
				Preimeter = 4.0
		=============================
		Rect 	Length = 2.5
				Width = 4.4
				---
				Area = 11.0
				Preimeter = 13.8
		=============================
		Rect 	Length = 3.6
				Width = 4.1
				---
				Area = 14.8
				Preimeter = 15.4
		=============================
		How many objects running? -->  3
	** ----------------------------------- */
	
	public static void main(String[] args){
		Rect[] obj = new Rect[3];
		int count = 0;
		
		obj[0] = new Rect(); // Use the default value.
		obj[1] = new Rect(6.0, 9.5);
		obj[2] = new Rect(8.6, 7.9);
		
		for (int i = 0; i < obj.length; i++){
			obj[i].showResult();
			count++;
		}
		System.out.printf("How many objects running? -->  %d\n --- \n", count);
		
		Coin one = new Coin(0.6, 1);
		Coin two = new Coin(0.6, 10);
		
		one.getData();
		two.getData();
		
	}
}