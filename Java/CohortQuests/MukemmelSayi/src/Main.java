import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number , result = 0;

        System.out.print("Sayı Giriniz : ");
        number = scan.nextInt();

        for (int i = 1 ; i < number ; i++){
            if (number % i == 0){
                result += i;
            }
        }
        if (number == result){
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir");
        }

    }
}