package homework_003;

import java.util.Scanner;

public class HomeWork_003 {
    public static void main(String[] args) {
        // getValueMonth(); //задание 1
        // getValueMonth2(); //задание 1 с switch
        // outputNumbers(); //задание 2
        // outputNumbers2(); //задание 3
        // checkNumbers(); //дз задача 1
        // checkTemp();    //дз задача 2
        // setValue(); //дз задача 3
        // outputSequence(); //дз задача 4
        //calculateValue(); // дз задача *

    }

    /*Задача 1:
    Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
    консоль соответствующую пору года по номеру месяца.*/

    public static void getValueMonth() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);
        if (value == 1 || value == 2 || value == 12) {
            System.out.println("Зима");
        } else if (value == 3 || value == 4 || value == 5) {
            System.out.println("Весна");
        } else if (value == 6 || value == 7 || value == 8) {
            System.out.println("Лето");
        } else if (value == 9 || value == 10 || value == 11) {
            System.out.println("Осень");
        } else System.out.println("Ошибка ввода");
    }


    /*Задача 1:
    Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
    консоль соответствующую пору года по номеру месяца. При решении использовать
    switch*/

    public static void getValueMonth2() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);

        switch (value) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка ввода");
                break;
        }
    }


    /*    Задача 2:
        Используя while вывести все числа от 0 до 25 в одну строку через пробел*/
    public static void outputNumbers() {
        int count = 0;
        while (count <= 25) {
            System.out.print(" " + count);
            count++;
        }
    }

    /*    Задача 3:
        Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.*/
    public static void outputNumbers2() {
        for (int counter = 2; counter <= 20; counter++) {
            if (counter % 2 == 0 && counter > 10) {
                System.out.println(counter);
            }
        }
    }


    /*
    Домашнее задание
    Блок2
    Задача 1:
    Напишите программу, которая будет принимать на вход число из консоли и на выход
    будет выводить сообщение четное число или нет. Для определения четности числа
    используйте операцию получения остатка от деления (операция выглядит так: '% 2').*/

    public static void checkNumbers() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.print("Вы ввели число " + value);
        if (value % 2 == 0) {
            System.out.print(" – это число четное");
        } else {
            System.out.print(" – это число не четное");
        }
    }

    /*
    Задача 2:
    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/

    public static void checkTemp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру на улице ");
        int temp = sc.nextInt();
        System.out.print(temp);
        if (temp > -5) {
            System.out.println(" – Warm");
        } else if (temp <= -5 && temp > -20) {
            System.out.println(" – Normal");
        } else System.out.println(" – Cold");
    }

    /*
    Задача 3:
    Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.*/
    public static void setValue() {
        for (int counter = 10; counter <= 20; counter++) {
            System.out.print(" " + Math.pow(counter, 2));
        }
    }

    /*Задача 4:
    Необходимо, чтоб программа выводила на экран вот такую последовательность:
            7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
    public static void outputSequence() {
        int counter = 7;
        while (counter <= 100) {
            System.out.print(" " + counter);
            counter = counter + 7;
        }
    }
    /*Задача *:
    Напишите программу, где пользователь вводит любое целое положительное число. А
    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    ввести некорректные данные*/

    public static void calculateValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int sum = 0;
        int value = sc.nextInt();
        if (value <= 1) {
            System.out.println("Ошибка ввода");
        } else {
            for (int index = 1; index <= value; index++) {
                sum = index + sum;
            }
            System.out.println("Сумма всех целых чисел от 1 до " + value + " будет равно " + sum);
        }
    }
}
