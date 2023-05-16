import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz : ");

        int num = scan.nextInt();

        int count = 0 , sum = 0;

        while (num != 0){
            sum = (num%10) + sum;
            num /= 10;
            count++;
        }

        System.out.println("Toplam : " + sum);
    }
}