import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int tutar;
        double kdv018 = 0.18 , kdv08 = 0.08 , kdvTutar , kdvliTutar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Tutarı Giriniz : ");
        tutar = scan.nextInt();

        if(tutar <= 1000){
            kdvTutar = tutar * kdv018;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv'siz Tutar : " + tutar);
            System.out.println("Kdv Tutarı : " + kdvTutar);
            System.out.println("Kdv'li Tutar : " + kdvliTutar);
        } else if (tutar > 1000 ) {
            kdvTutar = tutar * kdv08;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv'siz Tutar : " + tutar);
            System.out.println("Kdv Tutarı : " + kdvTutar);
            System.out.println("Kdv'li Tutar : " + kdvliTutar);
        }
    }
}