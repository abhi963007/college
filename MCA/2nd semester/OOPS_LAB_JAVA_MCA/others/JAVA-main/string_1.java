class String_1 {
    public static void main(String args[]) {
        String str = "Java Programming";

        System.out.println("The string is: " + str);
        System.out.println("Length of the String is: " + str.length());
        System.out.println("Characters at second and fourth position are: " + str.charAt(1) + ", " + str.charAt(3));
        System.out.println("The substring using start index only is: " + str.substring(5));
        System.out.println("The substring using start and end index is: " + str.substring(0, 4));
    }
}

