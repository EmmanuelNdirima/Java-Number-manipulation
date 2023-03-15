import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for checking: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int numb) {
        int reverse = 0;
        int temp = numb;

        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        return (numb == reverse);
    }
}
