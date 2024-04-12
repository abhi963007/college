import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to search
        System.out.println("Enter the element to search:");
        int searchElement = scanner.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        scanner.close();
    }
}
