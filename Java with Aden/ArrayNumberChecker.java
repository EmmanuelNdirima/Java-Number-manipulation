import java.util.Scanner;

public class ArrayNumberChecker {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of size 15
        int[] arr = new int[15];

        // Read 15 integers from user and store them in array
        for (int numb = 0; numb < arr.length; numb++) {
            System.out.print("Enter value #" + (i+1) + ": ");
            arr[numb] = scanner.nextInt();
        }

        // Print the values stored in the array
        System.out.println("\nValues stored in the array:");
        for (int numb = 0; numb < arr.length; numb++) {
            System.out.print(arr[numb] + " ");
        }

        // Check if a number entered by user is present in the array
        System.out.print("\nEnter a number to search for: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int numb = 0; numb < arr.length; numb++) {
            if (arr[numb] == searchNumber) {
                System.out.println("The number found at index " + numb);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // Create a new array and copy elements in reverse order
        int[] reversedArr = new int[arr.length];
        for (int numb = 0; numb < arr.length; numb++) {
            reversedArr[numb] = arr[arr.length - 1 - numb];
        }

        // Print the elements of the new array on the screen
        System.out.println("\nValues stored in the reversed array:");
        for (int numb = 0; numb < reversedArr.length; numb++) {
            System.out.print(reversedArr[numb] + " ");
        }

        // Calculate the sum and product of all elements in array
        int sum = 0;
        int product = 1;
        for (int numb = 0; numb < arr.length; numb++) {
            sum += arr[numb];
            product *= arr[numb];
        }

        // Print the sum and product
        System.out.println("\nSum of all elements in array: " + sum);
        System.out.println("Product of all elements in array: " + product);
    }

}
