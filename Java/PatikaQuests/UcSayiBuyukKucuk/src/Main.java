import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Sayı : ");
        num1 = scan.nextInt();
        System.out.println("2. Sayı : ");
        num2 = scan.nextInt();
        System.out.println("3. Sayı : ");
        num3 = scan.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.println("num1 > num2 > num3");
        } else if (num1 > num3 && num3 > num2) {
            System.out.println("num1 > num3 > num2");
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("num2 > num1 > num3");
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("num2 > num3 > num1");
        } else if (num3 > num2 && num2 > num1) {
            System.out.println("num3 > num2 > num1");
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("num3 > num1 > num2");
        }


    }
}

