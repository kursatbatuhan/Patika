import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1 , kenar2;
        double hipo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kenar 1 : ");
        kenar1 = scan.nextInt();
        System.out.println("Kenar 2 : ");
        kenar2 = scan.nextInt();;

        hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenus : " + hipo);
    }
}