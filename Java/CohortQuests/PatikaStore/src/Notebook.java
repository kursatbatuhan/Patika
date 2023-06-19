class Notebook extends Product {
    private String storage;
    private String screenSize;
    private int ram;

    public Notebook(String id, String name, double price, double discount, int stock, Brand brand,
                    String storage, String screenSize, int ram) {
        super(id, name, price, discount, stock, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }
}
