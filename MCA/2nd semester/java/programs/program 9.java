public class StringOperations {
    public static void main(String[] args) {
        // Input string
        String str = "Hello, World!";

        // i. Find the length of the string.
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // ii. Character at second and fourth position
        char charAt2ndPosition = str.charAt(1);
        char charAt4thPosition = str.charAt(3);
        System.out.println("Character at second position: " + charAt2ndPosition);
        System.out.println("Character at fourth position: " + charAt4thPosition);

        // iii. Find the substring using start index only
        String subStringStartIndex = str.substring(7);
        System.out.println("Substring using start index only: " + subStringStartIndex);

        // iv. Find the substring using start index and end index
        String subStringStartEndIndex = str.substring(7, 12);
        System.out.println("Substring using start index and end index: " + subStringStartEndIndex);

        // v. Concatenate a given string to the end of another string.
        String concatenatedString = str.concat(" Welcome!");
        System.out.println("Concatenated string: " + concatenatedString);

        // vi. Replace a specified character with another character
        String replacedString = str.replace('l', 'z');
        System.out.println("String after replacement: " + replacedString);

        // vii. Check whether a given string starts with another string.
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("String starts with 'Hello': " + startsWithHello);

        // viii. Convert all characters in a string to lowercase.
        String lowerCaseString = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseString);

        // ix. Convert all characters in a string to uppercase.
        String upperCaseString = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);
    }
}
