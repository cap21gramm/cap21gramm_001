package homework_012;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HomeWork_012 {

   /* Задача 1:
    Вывести в консоль из строки которую пользователь вводит с клавиатуры все аббревиатуры.
    Аббревиатурой будем считать слово от 2 до 6 символов, состоящее только из прописных букв, без чисел*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод строки:");
        String str = scanner.nextLine();
        System.out.println("Введённая строка: " + str);

        String regex = "\\b[A-ZА-ЯЁ]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);


        System.out.println("Найденные аббревиатуры:");
        boolean foundAbbr = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            foundAbbr = true;
        }

        if (!foundAbbr) {
            System.out.println("Аббревиатуры не найдены.");
        }
    }
}