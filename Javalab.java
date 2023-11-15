 package javalab;
import java.util.Scanner;

public class Javalab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. ArithmeticException");
            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleArithmeticException();
                    break;
                case 2:
                    handleArrayIndexOutOfBoundsException();
                    break;
                case 3:
                    System.out.println("Exit program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void handleArithmeticException() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block for ArithmeticException");
        }
    }

    private static void handleArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter index to access in the array: ");
            int index = scanner.nextInt();

            int value = array[index];

            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block for ArrayIndexOutOfBoundsException");
        }
    }
}
