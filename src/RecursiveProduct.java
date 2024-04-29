import java.util.Scanner;

public class RecursiveProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  // Array to store five numbers

        // Prompt for five numbers
        System.out.println("Enter Five Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate product of the numbers recursively
        int result = recursiveMultiply(numbers, 0);

        // Display result
        System.out.println("The product of your 5 numbers is " + result);
    }

    // Recursive method
    public static int recursiveMultiply(int[] numbers, int index) {
        if (index == numbers.length) {
            return 1;  // Base case: if index is equal to length, return 1
        } else {
            return numbers[index] * recursiveMultiply(numbers, index + 1);
        }
    }
}