class CellPhone extends Product {
    private String storage;
    private String screenSize;
    private int camera;
    private double battery;
    private int ram;
    private String color;

    public CellPhone(String id, String name, double price, double discount, int stock, Brand brand,
                     String storage, String screenSize, int camera, double battery, int ram, String color) {
        super(id, name, price, discount, stock, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public double getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }
}
