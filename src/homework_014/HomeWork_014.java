package homework_014;

import java.io.*;

public class HomeWork_014 {

/*    Задача 1:
    В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
    Проанализировать и записать в другой файл самое длинное слово*/

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/homework_014/IN_txt.txt"));
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }

            String[] words = text.toString().split("[\\s\\p{Punct}]+");

            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            PrintWriter writer = new PrintWriter(new FileWriter("src/homework_014/OUT_txt.txt"));
            writer.println(longestWord);
            writer.close();

            System.out.println("Самое длинное слово в файле IN_txt: " + longestWord);
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
