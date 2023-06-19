public class BusinessAddress implements Address {
    private String street;
    private String city;
    private String zipCode;

    public BusinessAddress(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getAddressInfo() {
        return "Business Address: " + street + ", " + city + ", " + zipCode;
    }
}
