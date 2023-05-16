import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double result = 0.0;
        int num;

        System.out.println("N Değeri : ");

        num = scan.nextInt();

        for (double i = 1 ; i <= num ; i++){
            result += (1/i);
        }

        System.out.println("Sonuç : " + result);

    }
}