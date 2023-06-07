import java.util.Scanner;

public class Main {


    static boolean isPrime(int n , int i){
        if (n <= 2){
            return (n == 2) ? true : false;
        }
        if (n % i == 0){
            return false;
        }
        if (i * i > n){
            return true;
        }
        return isPrime(n , i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if (isPrime(n , 2)){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}