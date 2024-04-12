import java.util.Arrays;

public class NameSort {
    public static void main(String[] args) {
        // List of names
        String[] names = {"John", "Alice", "Bob", "David", "Emma"};

        // Sorting the array of names
        Arrays.sort(names);

        // Printing the sorted array
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
