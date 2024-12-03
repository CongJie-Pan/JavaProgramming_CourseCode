class Rect{
	
	double length, width;
	
	// The Empty Object Constructer 
	public Rect(){
		length = 1;
		width = 1;
	}
	
	public Rect(double l, double w){
		length = l;
		width = w;
	}
	public double getArea(){
		return length * width;
	}
	public double getPerimeter(){
		return (length + width)*2; 
	}
	public void getData(){
		System.out.printf("Rect \tLength = %.1f\n", length);
		System.out.printf("\tWidth = %.1f\n", width);
		System.out.println("\t---");
	}
	public void show(){
		getData();// this.getData()
		System.out.printf("\tArea = %.1f\n", getArea());
		System.out.printf("\tPreimeter = %.1f\n", getPerimeter());
		System.out.println("=============================");
	}


}

public class Inclass_12_03_2024_1 {

	public static void main(String args[]){
		
		Rect[] obj = new Rect[3];
		int count=0;
		
		obj[0] = new Rect(); // Add a new Constructor
		obj[1] = new Rect(2.5, 4.4);
		obj[2] = new Rect(3.6, 4.1);
		
		for(int i=0; i<obj.length; i++){
			obj[i].show();
			count++;
		}
		System.out.printf("How many objects running? -->  %d\n", count);
		
		//obj[0].show();
		//obj[1].show();
		//obj[2].show();
		
		/*
		Rect r1 = new Rect();
		Rect r2 = new Rect(3.2,4.6);
		r1.show();
		r2.show();
		*/
	}

}
