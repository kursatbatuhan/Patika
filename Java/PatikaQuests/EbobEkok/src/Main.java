import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 , num2 , ebob = 1 , ekok , count;

        System.out.println("1. Sayı : ");
        num1 = scan.nextInt();
        System.out.println("2. Sayı : ");
        num2 = scan.nextInt();

        int min = (num1 < num2) ? num1 : num2;
        System.out.println(min);
        count = min;
        while (true){
            count--;
            if (count != 0){
                if ((num1 % count == 0) && (num2 % count == 0)){
                    ebob = count;
                    break;
                }
            } else if (count == 0) {
                break;
            }


        }

        ekok = (num1 * num2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}