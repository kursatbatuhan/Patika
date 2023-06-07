import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int[][] board;
    private boolean[][] mines;
    private int rows;
    private int cols;
    private int totalMines;
    private int uncoveredCount;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols];
        this.mines = new boolean[rows][cols];
        this.totalMines = rows * cols / 4;
        this.uncoveredCount = 0;
    }

    public void play() {
        initializeBoard();
        printBoard();

        while (uncoveredCount < rows * cols - totalMines) {
            Point selectedPoint = getSelectedPoint();

            if (mines[selectedPoint.row][selectedPoint.col]) {
                System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                return;
            }

            uncoverPoint(selectedPoint);
            printBoard();
        }

        System.out.println("Tebrikler! Tüm mayınları buldunuz. Oyunu kazandınız.");
    }

    private void initializeBoard() {
        placeMines();
        calculateNumbers();
    }

    private void placeMines() {
        int minesPlaced = 0;
        Random random = new Random();

        while (minesPlaced < totalMines) {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);

            if (!mines[row][col]) {
                mines[row][col] = true;
                minesPlaced++;
            }
        }
    }

    private void calculateNumbers() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!mines[i][j]) {
                    int count = countNeighborMines(i, j);
                    board[i][j] = count;
                }
            }
        }
    }

    private int countNeighborMines(int row, int col) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidPoint(i, j) && mines[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private Point getSelectedPoint() {
        Scanner scanner = new Scanner(System.in);

        int row, col;
        do {
            System.out.print("Satır girin (0-" + (rows - 1) + "): ");
            row = scanner.nextInt();

            System.out.print("Sütun girin (0-" + (cols - 1) + "): ");
            col = scanner.nextInt();

            if (!isValidPoint(row, col)) {
                System.out.println("Geçersiz nokta! Tekrar deneyin.");
            }
        } while (!isValidPoint(row, col));

        return new Point(row, col);
    }

    private void uncoverPoint(Point point) {
        if (board[point.row][point.col] == 0) {
            uncoverZeroes(point.row, point.col);
        } else {
            uncoveredCount++;
        }
    }

    private void uncoverZeroes(int row, int col) {
        if (!isValidPoint(row, col) || board[row][col] != 0) {
            return;
        }

        if (!mines[row][col] && board[row][col] == 0) {
            board[row][col] = -1;
            uncoveredCount++;
        }

        uncoverZeroes(row - 1, col);
        uncoverZeroes(row + 1, col);
        uncoverZeroes(row, col - 1);
        uncoverZeroes(row, col + 1);
    }

    private boolean isValidPoint(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private void printBoard() {
        System.out.println("Mayın Tarlası");
        System.out.println("--------------");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == -1) {
                    System.out.print("  ");
                } else if (mines[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    private class Point {
        private int row;
        private int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}

