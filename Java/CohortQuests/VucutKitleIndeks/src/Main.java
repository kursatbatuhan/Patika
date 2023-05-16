import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,indeks;
        int kilo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden giriniz(örneğin : 1.82):");
        boy = scan.nextDouble();
        System.out.println("Kilonuz : ");
        kilo = scan.nextInt();

        indeks = kilo / (boy * boy);

        System.out.println("Vücur kitle indeksiz : " + indeks);

    }
}