import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        // Create and add individual and enterprise accounts to the account manager

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            Account account = accountManager.login(email, password);
            // Successfully logged in, you can use the account object here
        } catch (InvalidAuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
