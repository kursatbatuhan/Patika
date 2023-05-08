import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num , sum = 0 , count = 0 , avg;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (int i = 0 ; i <= num ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum = sum + i;
                count++;

            }
        }

        avg = sum / count;
        System.out.println(avg);
    }
}
