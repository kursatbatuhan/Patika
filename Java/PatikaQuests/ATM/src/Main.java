import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username , password;
        int hak = 3;
        int firstbalance = 1000;
        int select;
        int price;



while (true){
    System.out.println("Kullanıcı Adı : ");
    username = scan.nextLine();
    System.out.println("Şifre : ");
    password = scan.nextLine();
        if (username.equals("kursat") && password.equals("1234")){





                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = scan.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Yatırmak istediğiniz miktar : ");
                        price = scan.nextInt();
                        firstbalance = firstbalance + price;
                        System.out.println("İşlem Başarılı");
                        System.out.println("Yeni Bakiyeniz : " + firstbalance);

                    case 2:
                        System.out.println("Çekmek istediğiniz miktar : ");
                        price = scan.nextInt();
                        if (price > firstbalance){
                            System.out.println("Bakiye yetersiz!!");
                        } else {
                            firstbalance = firstbalance - price;
                            System.out.println("İşlem başarılı");
                            System.out.println("Yeni bakiyeniz : " + firstbalance);
                        }

                    case 3:
                        System.out.println("Bakiyeniz : " + firstbalance);

                    case 4:
                        break;

                }





        }else {
            hak--;
            System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Dene");

            if (hak == 0){
                System.out.println("Hesabınız bloke oldu");
                break;
            }else {
                System.out.println("Kalan Hakkınız : " + hak);
            }
        }
    }
    }
}