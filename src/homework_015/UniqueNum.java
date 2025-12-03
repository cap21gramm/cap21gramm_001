package homework_015;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNum {

/*    Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
            4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
    При решении использовать коллекции*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        Set<Integer> uniqueNum = new LinkedHashSet<>();

        String[] parts = in.split(",");

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part.trim());
                uniqueNum.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод, см. задание");
            }
        }
        System.out.println("Уникальные числа:");
        String result = uniqueNum.toString();
        System.out.println(result);
    }
}
