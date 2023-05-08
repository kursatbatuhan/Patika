import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int sum , num1 , num2 , select;

        Scanner scan = new Scanner(System.in);

        System.out.println("İlk Sayı : ");
        num1 = scan.nextInt();
        System.out.println("İkinci Sayı : ");
        num2 = scan.nextInt();

        System.out.println("Lütfen Yapacağınız İşlemi Seçiniz : ");
        System.out.println("1 - Toplama \n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        select = scan.nextInt();

        if (select == 1){
            sum = num1 + num2;
            System.out.println("Sonuç  :" + sum);
        } else if (select == 2) {
            sum = num1 - num2;
            System.out.println("Sonuç : " + sum);
        } else if (select == 3) {
            sum = num1 * num2;
            System.out.println("Sonuç : " + sum);
        } else if (select == 4) {
            sum = num1 / num2;
            System.out.println("Sonuç : " + sum);
        } else {
            System.out.println("Böyle Bir İşlem Yok");
        }
    }
}