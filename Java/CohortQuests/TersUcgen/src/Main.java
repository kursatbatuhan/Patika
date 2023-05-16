import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        System.out.print("Basamak Sayısı : ");
        number = scan.nextInt();

        for (int i = 0 ; i < number ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(" ");
            }
            for (int k = (2 * number - 1) ; k >= (2 * i + 1); k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}