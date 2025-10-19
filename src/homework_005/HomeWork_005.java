package homework_005;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_005 {
    public static void main(String[] args) {
        //findMax(); //задача 1
        //calcValues(); //задача2
        //calcDiag(); //задача 3
        //calcSum(); // ДЗ задача 1
        //chesse();//ДЗ задача 2
        snake();//ДЗ задача **


    }

    /*   Задача 1 – Создайте двумерный массив и заполните его псевдослучайными числами с помощью
        класса Random
        Найдите максимальное значение в созданном 2-мерном массиве.*/
    public static void findMax() {
        Random nums = new Random();
        int[][] mas = new int[4][4];
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                mas[row][col] = nums.nextInt(100);
            }
        }
        System.out.println("Двумерный массив с случайными цифрами:");
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                System.out.print(mas[row][col] + "\t");
            }
            System.out.println();
        }
        int max = mas[0][0];
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                if (mas[row][col] > max) {
                    max = mas[row][col];
                }
            }

        }
        System.out.println("Максимальное значение в массиве равно " + max);
    }


    /*    Создать зубчатый 2-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.*/
    public static void calcValues() {
        int[][] mas = new int[4][];
        mas[0] = new int[]{1, 2, 3, 4, 5};
        mas[1] = new int[]{6};
        mas[2] = new int[]{7, 8, 9};
        mas[3] = new int[]{10, 11, 12};
        System.out.println("Если зубчатый массив:");
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                System.out.print(mas[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("то количество ячеек будет равно: ");
        int summ = 0;
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                summ++;
            }
        }
        System.out.println(summ);
    }

    /*    Задача 3:
        Найдите сумму элементов на главной диагонали*/
    public static void calcDiag() {
        Random nums = new Random();
        int a = nums.nextInt(10);
        int[][] mas = new int[a][a];
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                mas[row][col] = nums.nextInt(100);

            }
        }
        System.out.println("Двумерный массив с случайными цифрами:");
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                System.out.print(mas[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.print("Сумма значений главной диагонали будет равна : ");
        int summ = 0;
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                if (col == row)
                    summ = summ + mas[row][col];
            }
        }
        System.out.println(summ);
    }

/*    Задача 1:
            1.1 Создать двумерный массив, заполнить его случайными числами.
            1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
            1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/

    public static void calcSum() {
        Random nums = new Random();
        int[][] mas = new int[5][5];
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                mas[row][col] = nums.nextInt(100);
            }
        }
        System.out.println("Двумерный массив с случайными цифрами:");
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                System.out.print(mas[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("Введите число которое необходимо добавить: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("Обновленный  массив :");
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                mas[row][col] = mas[row][col] + value;
                System.out.print(mas[row][col] + "\t");

            }
            System.out.println();
        }
        System.out.print("Тогда сумма всех элементов будет равна: ");

        int summ = 0;
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                summ = summ + mas[row][col];
            }
        }
        System.out.println(summ);
    }

    /*    Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White)*/
    public static void chesse() {
        char[][] mas = new char[8][8];
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                if ((row + col) % 2 != 1) {
                    mas[row][col] = 'W';

                } else if ((row + col) % 2 == 1) {
                    mas[row][col] = 'B';
                } else {
                    mas[row][col] = 'X';
                }

                System.out.print(mas[row][col] + "\t");
            }
            System.out.println();
        }

    }

/*    Задача *:
    Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    Формат входных данных:
    Программа получает на вход два числа n и m.
    Формат выходных данных:
    Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    символа*/

    public static void snake() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите значения n и m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mas = new int[n][m];
        int count = 0;
        for (int row = 0; row < n; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < m; col++) {
                    mas[row][col] = count++;
                }
            } else {
                for (int col = m - 1; col >= 0; col--) {
                    mas[row][col] = count++;
                }
            }
        }
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                System.out.print(mas[row][col] + "\t");
            }
            System.out.println();
        }
    }
}