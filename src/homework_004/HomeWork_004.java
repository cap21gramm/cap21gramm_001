package homework_004;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_004 {
    public static void main(String[] args) {
        //genNums(); //задача 1
        //getFruits();// задание 2
        //completeTask();// задание 3
        //setMas1();// Блок 2 ДЗ задача 00 вариант 1
        //setMas2();// Блок 2 ДЗ задача 00 вариант 2
        //goMas();// Блок 2 ДЗ задача 01
        //findMinMax();//Блок 2 ДЗ задача 02
        //findMinMaxIndex();//Блок 2 ДЗ задача 03
        //findZero();//Блок 2 ДЗ задача 04
        //changeMas();//Блок 2 ДЗ задача 05
        //checkMas();//Блок 2 ДЗ задача 06
        outputSequence();//Блок 2 ДЗ задача *
    }

    /*Задача 1:
    Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.*/
    public static void genNums() {
        Random nums = new Random();
        int[] values = new int[5];
        for (int index = 0; index < values.length; index++) {
            values[index] = nums.nextInt(1000);
            System.out.println("Если значение случайного числа равно " + values[index] +
                    " то его квадрат равен " + (values[index] * values[index]));
        }
    }
/*        Задача 2:
        2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
        2.2 вывести в консоль второй и четвертый.
        2.3 вывести в консоль длину массива.
        2.4 третий фрукт заменить на иной.
        2.5 проверить результат в консоли.*/

    public static void getFruits() {
        String[] fruit = new String[]{"Яблоко", "Апельсин", "Лимон", "Лайм"};
        System.out.println("Фрукт №2 это " + fruit[1]);
        System.out.println("Фрукт №4 это " + fruit[3]);
        System.out.println();

        System.out.println("Длина массива равна " + fruit.length);
        System.out.println();

        fruit[2] = "Манго";
        System.out.println(fruit[2]);
        System.out.println();

        System.out.println("Измененный массив:");
        for (int count = 0; count < fruit.length; count++) {
            System.out.println(fruit[count]);
        }
    }

    /*Задача 3:
    3.1 Создать пустой массив типа double с названием masDouble такого размера, который
    пользователь вводит с клавиатуры.
    3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
    консоль.
    3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
    обратном порядке.*/
    public static void completeTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите длину массива: ");
        int length = sc.nextInt();
        double[] masDouble = new double[length];
        for (int count = 0; count < masDouble.length; count++) {
            masDouble[count] = Math.random();
            System.out.println(masDouble[count]);
        }
        System.out.println();
        System.out.println("Каждый четный элемент в квадрате (прямая запись):"); //если элементы четные, то индекс нечетный ?!
        for (int count = 0; count < masDouble.length; count++) {
            if (count % 2 != 0) {
                masDouble[count] = (masDouble[count] * masDouble[count]);
            }
            System.out.println(masDouble[count]);
        }
        System.out.println();
        System.out.println("Обратный порядок тогда будет:");
        for (int count = masDouble.length - 1; count >= 0; count--) {
            System.out.println(masDouble[count]);
        }
    }

    /*
        Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
        массива (просто целое число). После того, как размер массива задан, заполнить его
        одним из двух способов: используя Math.random(), или каждый элемент массива вводится
        пользователем вручную. Попробовать оба варианта. После заполнения массива
        данными, решить для него следующие задачи:
    */
    public static void setMas1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int count = 0; count < mas.length; count++) {
            mas[count] = (int) (Math.random() * 1000);
            System.out.println(mas[count]);
        }
    }

    public static void setMas2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int count = 0; count < mas.length; count++) {
            mas[count] = sc.nextInt();
            System.out.println(mas[count]);
        }
    }

    /*    Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
    public static void goMas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        System.out.println("Массив в прямом порядке:");
        for (int count = 0; count < mas.length; count++) {
            mas[count] = (int) (Math.random() * 1000);
            System.out.println(mas[count]);
        }
        System.out.println();
        System.out.println("Массив в обратном порядке:");
        for (int count = length - 1; count >= 0; count--) {
            System.out.println(mas[count]);
        }
    }

    /*    Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль.*/
    public static void findMinMax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int count = 0; count < mas.length; count++) {
            mas[count] = (int) (Math.random() * 1000);
            System.out.println(mas[count]);
        }
        System.out.print("В заданном массиве минимальное значение равно ");
        int min = mas[0];
        int max = mas[0];
        for (int count = 1; count < mas.length; count++) {
            if (min > mas[count]) {
                min = mas[count];
            }
        }
        System.out.println(min);

        System.out.print("В заданном массиве максимальное значение равно ");
        for (int count = 1; count < mas.length; count++) {
            if (max < mas[count]) {
                max = mas[count];
            }
        }
        System.out.println(max);
    }

    /*
        Задача 3:
        Найти индексы минимального и максимального элементов и вывести в консоль.*/
    public static void findMinMaxIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int count = 0; count < mas.length; count++) {
            mas[count] = (int) (Math.random() * 1000);
            System.out.println(mas[count]);
        }
        System.out.print("В заданном массиве индекс минимального значения равен ");
        int min = mas[0];
        int minIndex = 0;
        int max = mas[0];
        int maxIndex = 0;
        for (int count = 1; count < mas.length; count++) {
            if (min > mas[count]) {
                min = mas[count];
                minIndex = count;
            }
        }
        System.out.println(minIndex);
        System.out.print("В заданном массиве индекс максимального значения равно ");
        for (int count = 1; count < mas.length; count++) {
            if (max < mas[count]) {
                max = mas[count];
                maxIndex = count;
            }
        }
        System.out.println(maxIndex);
    }

    /*    Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        сообщение, что их нет*/
    public static void findZero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int index = 0; index < mas.length; index++) {
            mas[index] = sc.nextInt();
            System.out.println(mas[index]);
        }
        int index = 0;

        for (int count = 0; count < mas.length; count++) {
            if (mas[count] == 0) {
                index++;
            }
        }
        if (index != 0) {
            System.out.println("Количество нулевых элементов в заданном массиве " + index);
        } else {
            System.out.println("нет нулевых элементов в заданном массиве");
        }
    }

    /*    Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.*/
    public static void changeMas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int count = 0; count < mas.length; count++) {
            mas[count] = (int) (Math.random() * 1000);
            System.out.println(mas[count]);
        }
        System.out.println("Измененный массив :");
        int dlmas = mas.length;
        for (int count = 0; count < dlmas / 2; count++) {
            int vr = mas[count];
            mas[count] = mas[dlmas - 1 - count];
            mas[dlmas - 1 - count] = vr;
        }
        for (int count = 0; count < mas.length; count++) {
            System.out.println(mas[count]);
        }
    }

    /*    Задача 6:
    Проверить, является ли массив возрастающей последовательностью (каждое следующее
    число больше предыдущего).*/
    public static void checkMas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int length = sc.nextInt();
        int[] mas = new int[length];
        for (int index = 0; index < mas.length; index++) {
            mas[index] = sc.nextInt();
            System.out.println(mas[index]);
        }
        boolean upp = true;
        for (int count = 0; count < mas.length - 1; count++) {
            if (mas[count] >= mas[count + 1]) {
                upp = false;
                break;
            }
        }
        if (upp == true) {
            System.out.println("Введенный массив является возрастающим");
        } else {
            System.out.println("Введенный массив не является возрастающим");
        }
    }

/*    Задача *:
    Имеется массив из неотрицательных чисел(любой). Представьте что массив
    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    содержит нуля в начале, кроме самого числа 0.
    Пример:
    Input: [1,4,0,5,6,3]
    Output: [1,4,0,5,6,4]
    Input: [9,9,9]
    Output: [1,0,0,0*/

    public static void outputSequence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        boolean start = true;
        int length = sc.nextInt();
        int[] mas = new int[length];
        System.out.println("значения массива д.б. от 0 до 9");
        for (int count = 0; count < mas.length; count++) {
            mas[count] = sc.nextInt();
            if (mas[count] >= 0 && mas[count] <= 9) {
                System.out.println(mas[count]);
            } else {
                System.out.println("Ошибка ввода");
                start = false;
                break;
            }
        }

        if (start == true) {
            boolean vivod = false;
            int rzrd = 1;
            for (int count = mas.length - 1; count >= 0; count--) {
                int summ = mas[count] + rzrd;
                if (summ >= 10) {
                    mas[count] = summ - 10;
                    rzrd = 1;
                } else {
                    mas[count] = summ;
                    rzrd = 0;
                }

                if (rzrd == 0) break;
            }

            if (rzrd > 0) {
                vivod = true;
                int[] newMas = new int[mas.length + 1];
                newMas[0] = rzrd;
                for (int newcount = 1, count = 0; count < mas.length; newcount++, count++) {
                    newMas[newcount] = mas[count];

                }

                System.out.println("массив с добавленной единицей (массив был расширен): ");
                for (int count = 0; count < newMas.length; count++) {
                    System.out.print(newMas[count] + " ");

                }
            }

            if (vivod == false) {
                System.out.println("массив с добавленной единицей: ");
                for (int count = 0; count < mas.length; count++) {
                    System.out.print(mas[count] + " ");
                }
            }

        }

    }
}