import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int myNum1;
        int myNum2;
        int myNum3;
        int largetNumber;

        myNum1 = inputNumber.nextInt();
        myNum2 = inputNumber.nextInt();
        myNum3 = inputNumber.nextInt();

        inputNumber.close();

        largetNumber = myNum1;
        if (largetNumber < myNum2)
            largetNumber = myNum2;
        if (largetNumber < myNum3)
            largetNumber = myNum3;
        if (myNum1 == myNum2 && myNum2 == myNum3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The largest number is " + largetNumber);
        }
    }
}