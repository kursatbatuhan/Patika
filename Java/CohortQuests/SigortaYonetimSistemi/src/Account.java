import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Account {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private List<Insurance> insurances;

    public Account(User user) {
        this.authenticationStatus = AuthenticationStatus.FAIL;
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    public enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }
    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
            user.setLastLoginDate(new Date());
        } else {
            throw new InvalidAuthenticationException("Invalid email or password.");
        }
    }

    public void addAddress(Address address) {
        user.addAddress(address);
    }

    public void removeAddress(Address address) {
        user.removeAddress(address);
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public abstract void addInsurance(Insurance insurance);

    public void showUserInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Profession: " + user.getProfession());
        System.out.println("Age: " + user.getAge());
        System.out.println("Last Login Date: " + user.getLastLoginDate());
        System.out.println("Addresses:");
        for (Address address : user.getAddresses()) {
            System.out.println(address.getAddressInfo());
        }
    }
}
