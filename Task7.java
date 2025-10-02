import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float myNum1;
        float myNum2;

        System.out.println("Please enter the first number");
        myNum1 = sc.nextFloat();
        System.out.println("Please enter the second number");
        myNum2 = sc.nextFloat();
        System.out.println();

        System.out.println(myNum1 + " + " + myNum2 + " = " + plus(myNum1, myNum2));
        System.out.println(myNum1 + " - " + myNum2 + " = " + minus(myNum1, myNum2));
        System.out.println(myNum1 + " * " + myNum2 + " = " + multiply(myNum1, myNum2));
        System.out.println(myNum1 + " / " + myNum2 + " = " + divide(myNum1, myNum2));

        sc.close();
    }

    static float plus(float num1, float num2) {
        return num1 + num2;
    }

    static float minus(float num1, float num2) {
        return num1 - num2;

    }

    static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    static float divide(float num1, float num2) {
        return num1 / num2;
    }
}