class string1 {
    public static void main(String[] args) {
        String str = args[0];
        String toCheckStr = "hello";
        
        if (str.startsWith(toCheckStr)) {
            System.out.println("The string does start with " + toCheckStr);
        } else {
            System.out.println("The string does not start with " + toCheckStr);
        }
    }
}

