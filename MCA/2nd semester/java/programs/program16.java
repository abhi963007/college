import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

class Authenticator {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new AuthenticationException("Invalid username or password.");
        }
        System.out.println("Authentication successful!");
        // Additional authentication logic can be added here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authenticator authenticator = new Authenticator();
        
        // Input username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        // Input password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Authenticate
        try {
            authenticator.authenticate(username, password);
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner to prevent resource leak
        }
    }
}

