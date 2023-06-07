public class Main {
    public static void main(String[] args) {
        char[][] letterB = {
                {'*', '*', ' ', ' ', ' '},
                {'*', ' ', '*', ' ', ' '},
                {'*', ' ', '*', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', ' ', '*', ' ', ' '},
                {'*', ' ', '*', ' ', ' '},
                {'*', '*', ' ', ' ', ' '}
        };

        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                System.out.print(letterB[i][j]);
            }
            System.out.println();
        }
    }
}