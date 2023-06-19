import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Brand> brands = createBrands();

        List<Product> products = new ArrayList<>();
        products.add(new CellPhone("1", "SAMSUNG GALAXY A51", 3199.0, 0.0, 10, brands.get(0), "128 GB", "6.5 Inc", 4000, 6, 12,"Siyah"));
        products.add(new CellPhone("2", "iPhone 11 64 GB", 7379.0, 0.0, 5, brands.get(1), "64 GB", "6.1 Inc", 3046, 6, 12,"Mavi"));
        products.add(new CellPhone("3", "Redmi Note 10 Pro 8GB", 4012.0, 0.0, 8, brands.get(7), "128 GB", "6.5 Inc", 4000, 12,12, "Beyaz"));
        products.add(new Notebook("1", "HUAWEI Matebook 14", 7000.0, 0.0, 3, brands.get(3), "512 SSD", "14 inç", 16));
        products.add(new Notebook("2", "LENOVO V14 IGL", 3699.0, 0.0, 8, brands.get(5), "1024 SSD", "14 inç", 8));
        products.add(new Notebook("3", "ASUS Tuf Gaming", 8199.0, 0.0, 5, brands.get(6), "2048 SSD", "15.6 inç", 32));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    listNotebooks(products);
                    break;
                case 2:
                    listCellPhones(products);
                    break;
                case 3:
                    listBrands(brands);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
        System.out.print("Tercihiniz: ");
    }

    private static void listNotebooks(List<Product> products) {
        List<Notebook> notebooks = filterNotebooks(products);

        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.format("| %-3s | %-29s | %-9.2f TL | %-9s | %-10s | %-9s | %-12d |\n",
                    notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrand().getName(),
                    notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    private static void listCellPhones(List<Product> products) {
        List<CellPhone> cellPhones = filterCellPhones(products);

        System.out.println("Cep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (CellPhone cellPhone : cellPhones) {
            System.out.format("| %-3s | %-29s | %-9.2f TL | %-9s | %-10s | %-9s | %-9d | %-9.1f | %-9d | %-9s |\n",
                    cellPhone.getId(), cellPhone.getName(), cellPhone.getPrice(), cellPhone.getBrand().getName(),
                    cellPhone.getStorage(), cellPhone.getScreenSize(), cellPhone.getCamera(), cellPhone.getBattery(),
                    cellPhone.getRam(), cellPhone.getColor());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void listBrands(List<Brand> brands) {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        Collections.sort(brands);
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    private static List<Brand> createBrands() {
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
        return brands;
    }

    private static List<Notebook> filterNotebooks(List<Product> products) {
        List<Notebook> notebooks = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Notebook) {
                notebooks.add((Notebook) product);
            }
        }
        return notebooks;
    }

    private static List<CellPhone> filterCellPhones(List<Product> products) {
        List<CellPhone> cellPhones = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof CellPhone) {
                cellPhones.add((CellPhone) product);
            }
        }
        return cellPhones;
    }
}

