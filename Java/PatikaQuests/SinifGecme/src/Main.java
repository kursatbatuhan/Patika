import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ort;
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notu : ");
        mat = scan.nextInt();

        System.out.println("Fizik Notu : ");
        fizik = scan.nextInt();

        System.out.println("Türkçe Notu : ");
        turkce = scan.nextInt();

        System.out.println("Kimya Notu : ");
        kimya = scan.nextInt();

        System.out.println("Müzik Notu : ");
        muzik = scan.nextInt();



        if (mat < 0 || mat > 100){
            ort = (fizik + turkce + kimya + muzik) / 5;
            System.out.println("Ortalama : " + ort);
        } else if (fizik < 0 || fizik > 100) {
            ort = (mat + turkce + kimya + muzik) / 5;
            System.out.println("Ortalama : " + ort);
        }else if (turkce < 0 || turkce > 100) {
            ort = (mat + fizik + kimya + muzik) / 5;
            System.out.println("Ortalama : " + ort);
        }else if (kimya < 0 || kimya > 100) {
            ort = (mat + fizik + turkce + muzik) / 5;
            System.out.println("Ortalama : " + ort);
        }else if (muzik < 0 || muzik > 100) {
            ort = (mat + fizik + turkce + kimya) / 5;
            System.out.println("Ortalama : " + ort);
        } else {
            ort = (mat + fizik + turkce + kimya + muzik) / 5;
            System.out.println("Ortalama : " + ort);
        }

        if (ort >= 55){
            System.out.println("Geçti");
        }else {
            System.out.println("Kaldı");
        }

    }
}