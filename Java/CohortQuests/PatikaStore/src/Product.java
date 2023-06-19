abstract class Product {
    private String id;
    private String name;
    private double price;
    private double discount;
    private int stock;
    private Brand brand;

    public Product(String id, String name, double price, double discount, int stock, Brand brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public Brand getBrand() {
        return brand;
    }
}
