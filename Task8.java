import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");

        int count = sc.nextInt();
        int[] inputParameters = new int[count];

        for (int x = 0; x < inputParameters.length; x++) {
            inputParameters[x] = sc.nextInt();
        }

        Nums(inputParameters);
    }

    static int Nums(int... numbers) {
        for (int num : numbers) {
            System.out.println("With number " + num);
            int sum = 0;
            for (int x = 0; x <= num; x++) {
                sum += x;
            }
            System.out.println("The total is " + sum);
        }
        return 0;
    }
}
