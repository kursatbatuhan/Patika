import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101); // 0-100 arasında rastgele sayı seçilir
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("0 ile 100 arasında bir sayı tahmin edin.");

        while (!guessedCorrectly) {
            System.out.print("Tahmininiz: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz.");
                System.out.println("Tahmin etmek için " + attempts + " denemede bulundunuz.");
            } else if (guess < randomNumber) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else {
                System.out.println("Daha düşük bir sayı girin.");
            }
        }
    }
}
