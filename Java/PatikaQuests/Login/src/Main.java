import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String username , pass , passchan , passcontrol;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı Adı : ");
        username = scan.nextLine();
        System.out.println("Şifre : ");
        pass = scan.nextLine();

        if (username.equals("kursat") && pass.equals("batuhan")) {
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Hatalı Şifre Girdiniz");
            System.out.println("Şifrenizi Değiştirmek İstiyorsanız Ekrana Evet Yazın");
            System.out.println("Değiştirmek İstemiyorsanız Hayır Yazın");

            passchan = scan.nextLine();
            if (passchan.equals("Evet")){
                System.out.println("Yeni Şifreniz : ");
                passcontrol = scan.nextLine();
                if (passcontrol.equals(pass)){
                    System.out.println("Yanlış Girdiğiniz Şifre İle Aynı Şifreyi Koyamazsınız");
                } else if (passcontrol.equals("batuhan")) {
                    System.out.println("Unuttuğunuz Şifre ile Aynı Şifreyi Koyamazsınız");
                }else {
                    System.out.println("Şifreniz Başarı ile Değiştirildi");
                }
            } else {
                System.out.println("İşleminiz İptal Edildi!!");
            }

        }

    }
}