import java.util.Scanner;

public class PrimeNumber {
	
	// method to check if a number is a prime number
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int primen = 2; primen <= primen; primen++) {
            if (num % primen == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	// creating a new scanners
        Scanner input = new Scanner(System.in);
        // capturing the users input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        // this prints the prime numbers from to 500
        System.out.println("Here is a list of prime numbers from 1-500:");
        for (int nums = 1; nums <= 500; nums++) {
            if (isPrime(nums)) {
                System.out.print(nums + " ");
            }
        }
    }
}
