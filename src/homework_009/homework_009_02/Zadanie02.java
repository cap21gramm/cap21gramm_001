package homework_009.homework_009_02;

import com.sun.source.tree.Tree;

import java.util.Random;
import java.util.Scanner;


public class Zadanie02 {

/*  Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
    функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
    абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
    периметра всех фигур в массиве.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите стороны треугольника: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Figura figura = new Treugolnik(a, b, c);

        if (!((Treugolnik) figura).isValid()) {
        } else {
            System.out.println("Треугольник со сторнами " + a + " " + b + " " + c);
            System.out.println("Его площадь " + figura.getArea() + " Его периметр " + figura.getPerimetr());
        }
        System.out.println();
        System.out.println("Введите стороны прямоугольника: ");
        double l = sc.nextDouble();
        double m = sc.nextDouble();
        Figura figura2 = new Rectangle(l, m);
        if (!((Rectangle) figura2).isValid()) {
            System.out.println("Треугольник с заданными сторонами не может существовать");
        } else {
            System.out.println("Прямоугольник со сторнами " + l + " " + m);
            System.out.println("Его площадь " + figura2.getArea() + " Его периметр " + figura2.getPerimetr());
        }
        System.out.println();
        System.out.println("Введите радиус окружности: ");
        double r = sc.nextDouble();
        Figura figura3 = new Krug(r);
        if (!((Krug) figura3).isValid()) {
        } else {
            System.out.println("Окружность с радиусом " + r);
            System.out.println("Ее площадь " + figura3.getArea() + " Ее периметр " + figura3.getPerimetr());
        }

        System.out.println();
        System.out.println("Создадим массив из пяти случайных фигур:");


        Random rand = new Random();
        Figura[] figuras = new Figura[5];
        double summ = 0;
        int count = 0; // счетчик успешной генерации
        for (int i = 0; count < figuras.length; i++) {
            int type = rand.nextInt(3); // 0 - treug, 1 - rektangle, 2- krug
            if (type == 0) {
                double side1 = 1 + rand.nextDouble() * 100;
                double side2 = 1 + rand.nextDouble() * 100;
                double side3 = 1 + rand.nextDouble() * 100;
                Treugolnik temp = new Treugolnik(side1, side2, side3);
                if (temp.isValid()) {
                    figuras[count] = temp;
                    System.out.println((count+1) + ". Создали случайный треугольник со сторонами " + side1 +
                            " " + side2 + " " + side3);
                    summ += temp.getPerimetr();
                    count++;
                }

            } else if (type == 1) {
                double side1 = 1 + rand.nextDouble() * 100;
                double side2 = 1 + rand.nextDouble() * 100;
                Rectangle temp = new Rectangle(side1, side2);
                if (temp.isValid()) {
                    figuras[count] = temp;
                    System.out.println((count+1) + ". Создали случайный прямоугольник со сторонами " + side1 + " " + side2);
                    summ += temp.getPerimetr();
                    count++;
                }

            } else if (type == 2) {
                double rad = 1 + rand.nextDouble() * 100;
                Krug temp = new Krug(rad);
                if (temp.isValid()) {
                    figuras[count] = temp;
                    System.out.println((count+1) + ". Создали случайный круг с радиусом " + rad);
                    summ += temp.getPerimetr();
                    count++;
                }
            }

        }
        System.out.println("Сумма периметров созданных случайных фиггур  равняется " + summ);
    }

}

