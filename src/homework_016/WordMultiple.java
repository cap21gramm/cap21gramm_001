package homework_016;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

/*Задача 1:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
    2 или более раз. Пример:
    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true}*/

    public static void main(String[] args) {

        Map<String, Boolean> result1 = wordMultiple(new String[]{"a", "b", "a", "c", "b"});
        System.out.println(result1);

        Map<String, Boolean> result2 = wordMultiple(new String[]{"c", "b", "a"});
        System.out.println(result2);

        Map<String, Boolean> result3 = wordMultiple(new String[]{"c", "c", "c", "c"});
        System.out.println(result3);
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();
        for (String word : countMap.keySet()) {
            result.put(word, countMap.get(word) >= 2);
        }
        return result;
    }
}