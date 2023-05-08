import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km , acilis = 10;
        double tutar , odenecek ,  kmbasi = 2.2;


        Scanner scan = new Scanner(System.in);

        System.out.println("Gidilen Kilometre : ");
        km = scan.nextInt();

        odenecek = acilis + (km * kmbasi);

        if (odenecek <= 20){
            odenecek = 20;
            System.out.println("Odenecek Tutar : " + odenecek);
        } else if (odenecek > 20) {
            System.out.println("Odenecek Tutar : " + odenecek);
        }


    }
}