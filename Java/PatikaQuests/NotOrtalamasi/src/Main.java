import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int mat , fizik , kimya , turkce , tarih , muzik;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notu : ");
        mat = scan.nextInt();
        System.out.println("Fizik Notu : ");
        fizik = scan.nextInt();
        System.out.println("Kimya Notu : ");
        kimya = scan.nextInt();
        System.out.println("Turkce Notu : ");
        turkce = scan.nextInt();
        System.out.println("Tarih Notu : ");
        tarih = scan.nextInt();
        System.out.println("Müzik Notu : ");
        muzik = scan.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik ;
        double ort = toplam / 6.0;

        System.out.println("Ortalama : " + ort);

        if(ort > 60){
            System.out.println("Sınıfı Geçti");
        } else if (ort <= 60) {
            System.out.println("Sınıfta Kaldı");
        }
    }
}