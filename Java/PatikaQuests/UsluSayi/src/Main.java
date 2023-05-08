import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num , us , sum = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi : ");
        num = scan.nextInt();
        System.out.println("Us : ");
        us = scan.nextInt();

        for (int i = 1 ; i <= us ; i++){
            sum = sum * num;
        }

        System.out.println(sum);
    }
}