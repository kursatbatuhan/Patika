import java.util.Date;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public void calculate() {
        // Calculation specific to residence insurance
    }
}
