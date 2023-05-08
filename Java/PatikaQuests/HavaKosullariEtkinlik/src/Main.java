import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Sıcaklık kaç : ");
        heat = scan.nextInt();
        
        if (heat < 5){
            System.out.println("Kayak");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinema");
        } else if (heat >= 15  && heat < 25) {
            System.out.println("Piknik");
        } else if (heat >= 25) {
            System.out.println("Yüzme");
        }
    }
}