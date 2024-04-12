import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        // Array of strings
        String[] strings = {"banana", "apple", "orange", "grape", "kiwi"};

        // Sorting the array
        Arrays.sort(strings);

        // Printing the sorted array
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
