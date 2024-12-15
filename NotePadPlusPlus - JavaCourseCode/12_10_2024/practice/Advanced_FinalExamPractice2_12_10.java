import java.util.Scanner;

abstract class Shape {
    String color;

    public void setColor(String c) {
        color = c;
    }

    public abstract void show();
}

class Circle extends Shape {
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[10]; // 陣列儲存最多 10 個形狀物件
        int count = 0;

        while (true) {
            System.out.println("Enter the type of shape (Circle or Rectangle) or 'exit' to stop:");
            String type = scanner.next();

            if (type.equalsIgnoreCase("exit")) {
                break;
            }

            if (type.equalsIgnoreCase("Circle")) {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);

                System.out.print("Enter color: ");
                String color = scanner.next();
                circle.setColor(color);

                shapes[count++] = circle;

            } else if (type.equalsIgnoreCase("Rectangle")) {
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);

                System.out.print("Enter color: ");
                String color = scanner.next();
                rectangle.setColor(color);

                shapes[count++] = rectangle;
            } else {
                System.out.println("Invalid shape type. Please enter 'Circle' or 'Rectangle'.");
            }

            // 陣列已滿時停止新增
            if (count >= shapes.length) {
                System.out.println("Shape list is full. Cannot add more shapes.");
                break;
            }
        }

        // 顯示所有物件資訊
        System.out.println("\nShapes you entered:");
        for (int i = 0; i < count; i++) {
            shapes[i].show();
        }

        scanner.close();
    }
}
