import java.util.Scanner;

public class Main {

    public static boolean isPalindromoe(String str){
        String rev = "";

        boolean ans = false;
        for (int i = str.length() - 1 ; i >= 0; i--){
            rev = rev + str.charAt(i);
        }


        if(str.equals(rev)){
            ans = true;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number;
        number = scan.next();

        boolean num = isPalindromoe(number);
        System.out.println(num);
    }
}