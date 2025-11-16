package homework_011;

import java.util.Scanner;

public class HomeWork_011 {

    public static void main(String[] args) {
        //stringLength();  // ДЗ 11 задача 1
        //sortString(); //ДЗ 11 задача 2
        //filtrString(); // ДЗ11 задача 3
        //findUniqSymb(); // ДЗ 11 задача 4
        duplicaterSymb(); // ДЗ 11 задача 5
    }

/*    Задача 1: Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
    Вывести найденные строки и их длину.*/

    public static void stringLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввод первой строки:");
        String str1 = scanner.nextLine();
        System.out.println("Ввод второй строки");
        String str2 = scanner.nextLine();
        System.out.println("Ввод третьей строки");
        String str3 = scanner.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = str3.length();

        String shortest = str1;
        int minLength = length1;
        String longest = str1;
        int maxLength = length1;

        if (length2 < minLength) {
            shortest = str2;
            minLength = length2;
        } else if (length2 > maxLength) {
            longest = str2;
            maxLength = length2;
        }
        if (length3 < minLength) {
            shortest = str3;
            minLength = length3;
        } else if (length3 > maxLength) {
            longest = str3;
            maxLength = length3;
        }
        System.out.println("Текст самой короткой строки: " + shortest + " ее длина: " + minLength);
        System.out.println("Текст самой длинной строки: " + longest + " ее длина: " + maxLength);
    }

/*    2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
    значений их длины.*/

    public static void sortString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод первой строки:");
        String str1 = scanner.nextLine();
        System.out.println("Ввод второй строки");
        String str2 = scanner.nextLine();
        System.out.println("Ввод третьей строки");
        String str3 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (str2.length() > str3.length()) {
            String temp = str2;
            str2 = str3;
            str3 = temp;
        }

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        System.out.println("Вывод строк по возрастанию длины:");
        System.out.println("Строка – " + str1 + " ---//--- ее длина = " + str1.length());
        System.out.println("Строка – " + str2 + " ---//--- ее длина = " + str2.length());
        System.out.println("Строка – " + str3 + " ---//--- ее длина = " + str3.length());
    }

/*    Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
    средней, а также их длину.*/

    public static void filtrString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод первой строки:");
        String str1 = scanner.nextLine();
        System.out.println("Ввод второй строки");
        String str2 = scanner.nextLine();
        System.out.println("Ввод третьей строки");
        String str3 = scanner.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = str3.length();

        double tmp = (length1 + length2 + length3) / 3.0;

        int count = 0;


        if (length1 < tmp) {
            System.out.println("Строка: " + str1 + " ее длина: " + length1 +
                    " это меньше среднего значения длины " + tmp);
            count++;
        }
        if (length2 < tmp) {
            System.out.println("Строка: " + str2 + " ее длина: " + length2 +
                    " это меньше среднего значения длины " + tmp);
            count++;
        }
        if (length3 < tmp) {
            System.out.println("Строка: " + str3 + " ее длина: " + length3 +
                    " это меньше среднего значения длины " + tmp);
            count++;
        }
        if (count == 0) {
            System.out.println("нет строк удовлетворяющим требованиям");
        }
    }

/*    Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
    Если таких слов несколько, найти первое из них*/

    public static void findUniqSymb() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод первой строки:");
        String str1 = scanner.nextLine();
        System.out.println("Ввод второй строки:");
        String str2 = scanner.nextLine();
        System.out.println("Ввод третьей строки:");
        String str3 = scanner.nextLine();

        String combine = str1 + " " + str2 + " " + str3;
        String[] words = combine.split("\\s+");

        for (String word : words) {
            boolean unique = true;
            for (int inChr = 0; inChr < word.length(); inChr++) {
                for (int outChr = inChr + 1; outChr < word.length(); outChr++) {
                    if (word.charAt(inChr) == word.charAt(outChr)) {
                        unique = false;
                        break;
                    }
                }
                if (!unique) break;
            }
            if (unique) {
                System.out.println("Первое слово с уникальными символами: " + word);
                return;
            }
        }

        System.out.println("слово из не повторяющихся символов не было найдено");
    }

/*    . Вывести на консоль новую строку, которой задублирована каждая буква из
    начальной строки. Например, "Hello" -> "HHeelllloo"*/

    public static void duplicaterSymb() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод строки:");
        String str = scanner.nextLine();
        StringBuilder strNew = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            char currentChar = str.charAt(index);
            strNew.append(currentChar).append(currentChar);
        }

        System.out.println("Результат: " + strNew.toString());
    }
}
