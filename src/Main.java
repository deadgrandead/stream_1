import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Фильтрация положительных и четных чисел
        Iterator<Integer> iterator = intList.iterator();
        ArrayList<Integer> positiveEvenNumbers = new ArrayList<>();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 0 && number % 2 == 0) {
                positiveEvenNumbers.add(number);
            }
        }

        // Сортировка отфильтрованных чисел в порядке возрастания
        Collections.sort(positiveEvenNumbers);

        // Вывод результата на экран
        for (Integer number : positiveEvenNumbers) {
            System.out.println(number);
        }
    }
}
