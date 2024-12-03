/* using extends*/

class Circle {
    double radius;
    
    public Circle(double r) {
        radius = r;
    }
    
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    public void show() {
        System.out.printf("Radius = %.1f; Area = %.1f \n", radius, getArea());
    }
}

class Coin extends Circle {
    int value;
    
    public Coin(double r, int v) {
        super(r);    // Now correctly calls the Circle constructor
        value = v;
    }
    
    public void getData() {
        System.out.printf("Coin Value = %d \n", value);
    }
}

public class Inclass_12_03_2024_2 {
    public static void main(String[] args) {
        Coin one = new Coin(0.6, 1);
        Coin ten = new Coin(0.6, 10);
        one.getData();
        one.show();
    }
}