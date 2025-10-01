import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float myNum1;
        float myNum2;

        System.out.println("Please enter the first number");
        myNum1 = sc.nextInt();
        System.out.println("Please enter the second number");
        myNum2 = sc.nextInt();
        System.out.println();

        System.out.println(myNum1 + " + " + myNum2 + " = " + plus(myNum1, myNum2));
        System.out.println(myNum1 + " - " + myNum2 + " = " + minus(myNum1, myNum2));
        System.out.println(myNum1 + " * " + myNum2 + " = " + multiply(myNum1, myNum2));
        System.out.println(myNum1 + " / " + myNum2 + " = " + divide(myNum1, myNum2));
    }

    static float plus(float num1, float num2) {
        float sum;
        sum = num1 + num2;
        return sum;
    }

    static float minus(float num1, float num2) {
        float difference;
        difference = num1 - num2;
        return difference;
    }

    static float multiply(float num1, float num2) {
        float product;
        product = num1 * num2;
        return product;
    }

    static float divide(float num1, float num2) {
        float quotient;
        quotient = num1 / num2;
        return quotient;
    }
}
