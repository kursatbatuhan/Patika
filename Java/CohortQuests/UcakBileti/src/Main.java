import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distance , age , type , price;
        double perdistance = 0.10;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scan.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = scan.nextInt();
        System.out.print("Yolculuk tipini seçiniz(1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        type = scan.nextInt();


        if(distance > 0 && age > 0){
            price = (int) (distance * perdistance);


            if(age < 12){
                price = (int) (price * 0.5);
            } else if (age > 12 && age < 24) {
                price = (int) (price * 0.9);
            } else if (age > 65) {
                price = (int) (price * 0.7);
            }

            if (type == 2){
                price = (int) (price * 0.8) * 2;
            }

            System.out.println("Toplam Tutar : " + price);

        } else {
            System.out.println("Hatalı Veri Girişi Yaptınız");
        }

    }
}