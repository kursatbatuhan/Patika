import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r , dalan ;
        double pi = 3.14 , cevre , alan , dilimalan;

        Scanner scan = new Scanner(System.in);


        System.out.println("Yarıçap(r) : ");
        r = scan.nextInt();
        System.out.println("Dilim Derece : ");
        dalan = scan.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;
        dilimalan = (pi * (r * r) * dalan) / 360;

        System.out.println("Çevre : " + cevre + " cm");
        System.out.println("Alan : " + alan + " cmkare");
        System.out.println("Dilim Alan : " + dilimalan + " cmkare");
    }
}