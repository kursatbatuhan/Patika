import java.util.Scanner;

public class Main {

    static int sum(int a , int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a , int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a , int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a , int b){
        if (b == 0){
            System.out.println("İkinci Sayı Sıfırdan Büyük olmalıdır");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }


    static int power(int a , int b){
        int result = 1;
        for (int i = 1 ; i <= b ; i++){
            result = result * a;
        }
        System.out.println("Üslü Sayı : " + result);
        return result;
    }

    static int factorial(int a){
        int result = 1;
        for(int i = 1 ; i <= a ; i++){
            result = result * i;
        }
        return result;
    }

    static int mod(int a , int b){
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = " 1 - Toplama\n 2 - Çıkarma\n 3 - Çarpma\n 4 - Bölme\n 5  - Üslü Sayı\n 6 - Faktoriyel\n 7 - Mod\n 8 - Çıkış";

        while (true){
            System.out.println("Yapmak İstediğiniz İşlemi Seçin");
            System.out.println(menu);
            int select;
            select = scan.nextInt();
            if (select == 6){
                int a = scan.nextInt();
                factorial(a);
                break;
            }

            int a , b;
            System.out.println("1. Sayı : ");
            a = scan.nextInt();
            System.out.println("2. Sayı : ");
            b = scan.nextInt();

            switch (select){
                case 1:
                    sum(a , b);
                    break;
                case 2:
                    minus(a , b);
                    break;
                case 3:
                    times(a , b);
                    break;
                case 4:
                    divided(a , b);
                    break;
                case 5:
                    power(a , b);
                    break;
                case 7:
                    mod(a , b);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Hatalı İşlem Seçimi");

            }

        }

    }
}