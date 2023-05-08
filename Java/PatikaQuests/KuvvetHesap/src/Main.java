import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num , a;
        num = scan.nextInt();
        for(int i = 1 ; i <= num ; i*=4){
            for (int j = 1 ; j <= i ; j*=5){
                System.out.println(i);
            }
        }
    }
}