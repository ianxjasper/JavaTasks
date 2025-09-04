import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.reverse();
        System.out.println("sb1 " + sb1);
        System.out.println("sb2 " + sb2);
        if (sb1.toString().equals(sb2.toString())) {
            System.out.println("The input string is a palindrome");
        } else {
            System.out.println("The input string is not a palindrome");
        }
    }
}