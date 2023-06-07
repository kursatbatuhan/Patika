import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 2, 4, 12, 14, 8, 16, 18, 20};

        List<Integer> repeatedEvenNumbers = findRepeatedEvenNumbers(numbers);

        if (repeatedEvenNumbers.isEmpty()) {
            System.out.println("Tekrar eden çift sayı bulunamadı.");
        } else {
            System.out.println("Tekrar eden çift sayılar: " + repeatedEvenNumbers);
        }
    }

    public static List<Integer> findRepeatedEvenNumbers(int[] numbers) {
        List<Integer> repeatedEvenNumbers = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedEvenNumbers.add(entry.getKey());
            }
        }

        return repeatedEvenNumbers;
    }
}
