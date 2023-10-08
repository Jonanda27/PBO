package task2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Shape
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("red", false);

        // Mencetak informasi Shape
        System.out.println("Shape 1: " + shape1.toString());
        System.out.println("Shape 2: " + shape2.toString());

        // Membuat objek Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);

        // Mencetak informasi Circle
        System.out.println("\nCircle 1: " + circle1.toString());
        System.out.println("Circle 2: " + circle2.toString());
        System.out.println("Circle 2 Area: " + circle2.getArea());
        System.out.println("Circle 2 Perimeter: " + circle2.getPerimeter());

        // Membuat objek Rectangle
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.0, 4.0);

        // Mencetak informasi Rectangle
        System.out.println("\nRectangle 1: " + rectangle1.toString());
        System.out.println("Rectangle 2: " + rectangle2.toString());
        System.out.println("Rectangle 2 Area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.getPerimeter());

        // Membuat objek Square
        Square square1 = new Square(5.0);

        // Mencetak informasi Square
        System.out.println("\nSquare 1: " + square1.toString());
        System.out.println("Square 1 Area: " + square1.getArea());
        System.out.println("Square 1 Perimeter: " + square1.getPerimeter());
    }
}

