import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n , r , nfak = 1 , rfak = 1 ,neksir, neksirfak = 1, kombinasyon;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("N : ");
        n = scan.nextInt();
        System.out.println("R : ");
        r = scan.nextInt();
        neksir = n - r;
        for (int i = 1 ; i <= n ; i++){
            nfak = nfak * i;
        }

        for (int i = 1 ; i <= r ; i++){
            rfak = rfak * i;
        }
        
        for (int i = 1 ; i <= neksir ; i++){
            neksirfak = neksirfak * i;
        }
        
        kombinasyon = nfak / (rfak * neksirfak);
        System.out.println(kombinasyon);
    }
}