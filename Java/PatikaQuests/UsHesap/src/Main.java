import java.util.Scanner;

public class Main {

    static int power(int a , int b){
        int result = 1;
        for (int i = 1 ; i <= b ; i++){
            result = result * a;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a ,b;
        System.out.println("Taban : ");
        a = scan.nextInt();
        System.out.println("Üs : ");
        b = scan.nextInt();
        power(a , b);
    }
}