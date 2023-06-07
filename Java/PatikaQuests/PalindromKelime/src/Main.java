import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Girdiğiniz kelime bir palindromiktir.");
        } else {
            System.out.println("Girdiğiniz kelime bir palindromik değildir.");
        }
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
