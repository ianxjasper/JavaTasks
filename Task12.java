import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int numX = sc.nextInt();
        System.out.println("Enter the value of y");
        int numY = sc.nextInt();
        System.out.println("How many times do you want the numbers to iterate?");
        int numIterate = sc.nextInt();
        Point p = new Point(numX, numY);
        for (int i = 0; i < numIterate; i++) {
            p.scale();
            p.print();
        }
    }
}

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void scale() {
        this.x /= 2;
        this.y /= 2;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}