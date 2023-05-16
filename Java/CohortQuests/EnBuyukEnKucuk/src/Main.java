import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count , number , min = 0 , max = 0 ;

        System.out.print("Kaç Sayı Gireceksiniz : ");
        count = scan.nextInt();

        for (int i = 1 ; i <= count ; i++){
            System.out.print(i + ". sayıyı giriniz : ");
            number = scan.nextInt();

            if (i == 1){
                max = number;
                min = number;
            }
            if (min > number){
                min = number;
            }
            if (max < number){
                max = number;
            }
        }

        System.out.println("En Büyük : " + max);
        System.out.println("En Küçük : " + min);


    }
}