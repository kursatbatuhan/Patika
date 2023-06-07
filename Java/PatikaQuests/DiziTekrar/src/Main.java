import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = calculateFrequency(numbers);

        System.out.println("Dizinin elemanlarının frekansı:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> calculateFrequency(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        return frequencyMap;
    }
}
