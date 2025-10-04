public class Task15 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(" ", "Blue", 6);
        Rectangle myRectangle = new Rectangle(" ", "Grey", 6, 6);
        Triangle myTriangle = new Triangle(" ", "Pink", 3, 3);

        myCircle.printable();
        myRectangle.printable();
        myTriangle.printable();
    }
}

interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String shape;
    String color;

    public AbstractShape(String shape, String color) {
        this.color = color;
        this.shape = shape;
    }

    void printable() {
        System.out.println("Shape:\t\t" + this.shape + "\nColor:\t\t" + this.color + "\nArea:\t\t" + calculateArea()
                + "\nPerimeter:\t" + calculatePerimeter() + "\n");
    }
}

class Circle extends AbstractShape {
    double radius;

    public Circle(String shape, String color, double radius) {
        super("Circle", color);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    double length;
    double width;

    public Rectangle(String Shape, String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }
}

class Triangle extends AbstractShape {
    double sideA;
    double sideB;

    public Triangle(String shape, String color, double sideA, double sideB) {
        super("Triangle", color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB + (Math.sqrt((sideA * sideA) + (sideB * sideB))));
    }
}