import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num , sum = 0;
        Scanner scan = new Scanner(System.in);

        while (true){
            num = scan.nextInt();
            if (num % 2 == 0 && num % 4 == 0){
                sum = sum + num;
            } else if (num % 2 != 0) {
                break;
            }
        }

        System.out.println(sum);
    }
}