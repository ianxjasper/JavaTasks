import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float myNum1;
        float myNum2;

        myNum1 = sc.nextInt();
        myNum2 = sc.nextInt();

        System.out.println(myNum1 + " + " + myNum2 + " = " + Plus(myNum1, myNum2));
        System.out.println(myNum1 + " - " + myNum2 + " = " + Minus(myNum1, myNum2));
        System.out.println(myNum1 + " * " + myNum2 + " = " + Multiply(myNum1, myNum2));
        System.out.println(myNum1 + " / " + myNum2 + " = " + Divide(myNum1, myNum2));

    }

    static float Plus(float num1, float num2) {
        float sum;
        sum = num1 + num2;
        return sum;
    }

    static float Minus(float num1, float num2) {
        float difference;
        difference = num1 - num2;
        return difference;
    }

    static float Multiply(float num1, float num2) {
        float product;
        product = num1 * num2;
        return product;
    }

    static float Divide(float num1, float num2) {
        float quotient;
        quotient = num1 / num2;
        return quotient;
    }
}
