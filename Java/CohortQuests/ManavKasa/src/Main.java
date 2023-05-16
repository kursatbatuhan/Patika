import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double armut = 2.14, elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00;

        double price = 0;
        int kg;

        System.out.println("Patika Manav");
        System.out.println("------------------------------");

        System.out.print("Armut Kaç Kilo : ");
        kg = scan.nextInt();
        price = price + (kg * armut);

        System.out.print("Elma Kaç Kilo : ");
        kg = scan.nextInt();
        price = price + (kg * elma);

        System.out.print("Domates Kaç Kilo : ");
        kg = scan.nextInt();
        price = price + (kg * domates);

        System.out.print("Muz Kaç Kilo : ");
        kg = scan.nextInt();
        price = price + (kg * muz);

        System.out.print("Patlıcan Kaç Kilo : ");
        kg = scan.nextInt();
        price = price + (kg * patlican);

        System.out.println("Toplam Tutar : " + price);
    }
}