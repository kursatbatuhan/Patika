import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
    }

    public Account login(String email, String password) throws InvalidAuthenticationException {
        for (Account account : accounts) {
            try {
                account.login(email, password);
                return account;
            } catch (InvalidAuthenticationException e) {
                // Do nothing and continue to the next account
            }
        }
        throw new InvalidAuthenticationException("Invalid email or password.");
    }
}
