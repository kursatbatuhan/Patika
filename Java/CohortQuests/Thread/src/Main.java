import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int THREAD_COUNT = 4;
    private static final int LIST_SIZE = 10000;
    private static final int PART_SIZE = LIST_SIZE / THREAD_COUNT;

    private static List<Integer> numberList = new ArrayList<>();
    private static List<Integer> evenNumbers = new ArrayList<>();
    private static List<Integer> oddNumbers = new ArrayList<>();

    public static void main(String[] args) {
        // 1'den 10000'e kadar olan sayıları içeren ArrayList'i oluştur
        for (int i = 1; i <= LIST_SIZE; i++) {
            numberList.add(i);
        }

        // Thread'leri başlat
        List<NumberThread> threads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            NumberThread thread = new NumberThread(i * PART_SIZE, (i + 1) * PART_SIZE);
            threads.add(thread);
            thread.start();
        }

        // Thread'lerin tamamlanmasını bekle
        for (NumberThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Sonuçları yazdır
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    private static class NumberThread extends Thread {
        private int start;
        private int end;

        public NumberThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                int number = numberList.get(i);
                if (number % 2 == 0) {
                    synchronized (evenNumbers) {
                        evenNumbers.add(number);
                    }
                } else {
                    synchronized (oddNumbers) {
                        oddNumbers.add(number);
                    }
                }
            }
        }
    }
}
