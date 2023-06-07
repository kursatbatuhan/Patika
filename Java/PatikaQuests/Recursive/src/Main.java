public class Main {

    public static void main(String[] args) {
        int n = 20;
        recursiveMethod(n);
    }

    public static void recursiveMethod(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            System.out.print(-n + " ");
            return;
        }

        recursiveMethod(n - 5);
        System.out.print(-n + " ");
        recursiveMethod(n - 5);
    }
}