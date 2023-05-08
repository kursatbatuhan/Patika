import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;

        Scanner scan = new Scanner(System.in);

        System.out.println("N : ");
        N = scan.nextInt();

        if (N % 2 != 0){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }

    }
}