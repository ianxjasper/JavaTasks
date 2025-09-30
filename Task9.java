import java.util.Scanner;
import static java.lang.Math.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.println("What numbers do you want me to add?");
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = sc.nextInt();
        }
        System.out.println("The sum of " + numbers[0] + " and " + numbers[1] + " is " + Add(numbers[0], numbers[1]));

        System.out.println("What numbers do you want me to Subtract?");
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = sc.nextInt();
        }
        System.out.println(
                "The difference of " + numbers[0] + " and " + numbers[1] + " is " + Subtract(numbers[0], numbers[1]));

        System.out.println("What numbers do you want me to Multiply?");
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = sc.nextInt();
        }
        System.out.println(
                "The product of " + numbers[0] + " and " + numbers[1] + " is " + Multiply(numbers[0], numbers[1]));

        System.out.println("What numbers do you want me to Divide?");
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = sc.nextInt();
        }
        System.out.println(
                "The quotient of " + numbers[0] + " and " + numbers[1] + " is " + Divide(numbers[0], numbers[1]));
    }

    public static int Add(int a, int b) {
        int sum = Math.addExact(a, b);
        return sum;
    }

    public static int Subtract(int a, int b) {
        int difference = Math.subtractExact(a, b);
        return difference;
    }

    public static int Multiply(int a, int b) {
        int product = Math.multiplyExact(a, b);
        return product;
    }

    public static float Divide(int a, int b) {
        int quotient = Math.floorDiv(a, b);
        return quotient;
    }
}
