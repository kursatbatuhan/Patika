import java.util.List;

public class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double priceWithMargin = insurance.getPrice() * 1.1; // Apply 10% profit margin for enterprise customers
        insurance.setPrice(priceWithMargin);
        getInsurances().add(insurance);
    }

    @Override
    public List<Insurance> getInsurances() {
        return super.getInsurances();
    }
}
