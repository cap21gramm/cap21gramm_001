package homework_016;

import java.util.*;

public class Examp {
/*    На вход поступает массив непустых строк, создайте и верните Map<String,
    String> следующим образом: для каждой строки добавьте ее первый символ в
    качестве ключа с последним символом в качестве значения. Пример:
    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    pairs(["man", "moon", "main"]) → {"m": "n"}
    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}*/

    public static void main(String[] args) {
        // Тест 1: ["code", "bug"] → {"b": "g", "c": "e"}
        String[] test1 = {"code", "bug"};
        System.out.println("Test 1: " + pairs(test1));

        // Тест 2: ["man", "moon", "main"] → {"m": "n"}
        String[] test2 = {"man", "moon", "main"};
        System.out.println("Test 2: " + pairs(test2));

        // Тест 3: ["man", "moon", "good", "night"] → {"g": "d", "m": "n", "n": "t"}
        String[] test3 = {"man", "moon", "good", "night"};
        System.out.println("Test 3: " + pairs(test3));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length() - 1));
            result.put(first, last);
        }
        return result;
    }
}
