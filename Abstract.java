abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Interface representing a printable object
interface Printable {
    void print();
}

// Class implementing the Printable interface
class PrintableRectangle extends Rectangle implements Printable {
    // Constructor
    public PrintableRectangle(double length, double width) {
        super(length, width);
    }
