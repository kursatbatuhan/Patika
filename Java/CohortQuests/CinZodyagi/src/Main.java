import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year;
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = scan.nextInt();

        if (year % 12 == 0){
            System.out.println("Maymun");
        }
        if (year % 12 == 1){
            System.out.println("Horoz");
        }
        if (year % 12 == 2){
            System.out.println("Köpek");
        }
        if (year % 12 == 3){
            System.out.println("Domuz");
        }
        if (year % 12 == 4){
            System.out.println("Fare");
        }
        if (year % 12 == 5){
            System.out.println("Öküz");
        }
        if (year % 12 == 6){
            System.out.println("Kaplan");
        }
        if (year % 12 == 7){
            System.out.println("Tavşan");
        }
        if (year % 12 == 8){
            System.out.println("Ejderha");
        }
        if (year % 12 == 9){
            System.out.println("Yılan");
        }
        if (year % 12 == 10){
            System.out.println("At");
        }
        if (year % 12 == 11){
            System.out.println("Koyun");
        }
    }
}