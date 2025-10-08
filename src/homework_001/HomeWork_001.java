package homework_001;

public class HomeWork_001 {
    public static void main(String[] args) {

        setName();
        setNameAge();
        calculateValue1();
        calculateValue2();
        calculateValue3();
        roundindValue1();
        setValueDivision();
        changeValue1();
        changeValue2();
    }

    /*Блок 1 Задача 1:
     Создать программу, которая будет выводить в консоли Ваше имя и фамилию*/
    public static void setName() {
        System.out.println("Ответ  Блок - 1 Задача - 1:");
        System.out.println("Мое имя и фамилия – Садовник Александр");
        System.out.println();
    }

    /*Блок 1 Задача 2:
    Добавить в программу целочисленную переменную с названием age, в которой будет
    храниться ваш возраст. Вывести в консоли ваше имя, фамилию и возраст.*/

    public static void setNameAge() {
        int age = 38;
        System.out.println("Ответ  Блок - 1 Задача - 2:");
        System.out.println("Мое имя и фамилия – Садовник Александр, мне " + age + " лет");
        System.out.println();
    }

    /*Блок 2 Задача 1:
    Написать приложение, которое будет вычислять и выводить значение по формуле:
    a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.*/
    public static void calculateValue1() {
        double b = 38.258;
        double c = -24.4545;
        double a = 4 * (b + c - 1) / 2;
        System.out.println("Ответ  Блок - 2 Задача - 1:");
        System.out.println("Результат решения формулы будет : " + a);
        System.out.println();
    }

    /*Блок 2 Задача 2:
    В переменной n хранится двузначное число. Создайте программу, вычисляющую и
    выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
    (2+6).*/
    public static void calculateValue2() {
        int n = -12;
        int a = n / 10;
        int b = n % 10;
        int sum = a + b;
        System.out.println("Ответ  Блок - 2 Задача - 2:");
        System.out.println("Результат суммы цифр n будет : " + sum);
        System.out.println();
    }

    /* Блок 2 Задача 3:
      В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
      выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
      9 (1+2+6).*/
    public static void calculateValue3() {
        int n = 391;
        int a = n % 10; //забрали правую цифру
        int b = n / 100; //забрали левую цифру
        int c = (n / 10) % 10; //забрали среднюю цифру
        int sum = a + b + c;
        System.out.println("Ответ  Блок - 2 Задача - 3:");
        System.out.println("Результат суммы цифр n будет : " + sum);
        System.out.println();
    }

    /* Блок 2 Задача 4:
    В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    программу, округляющую число n до ближайшего целого и выводящую результат на
    экран*/
    public static void roundindValue1() {
        double n = 38.058;
        int a = (int) (n); //забрали целую часть
        double m = n % 1; //забрали остаток
        System.out.println("Ответ  Блок - 2 Задача - 4:");
        if (m >= 0.5) {
            System.out.println("Результат округления n будет : " + (a + 1));
        } else {
            System.out.println("Результат округления n будет : " + a);
        }
        System.out.println();
    }

    /* Блок 2 Задача 5:
     В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
     на экран результат деления q на w с остатком. Пример вывода программы (для случая,
     когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
    public static void setValueDivision() {
        int q = 21;
        int w = 8;
        int a = q / w;
        int b = q % w;
        System.out.println("Ответ  Блок - 2 Задача - 5:");
        System.out.println("Значение деления будет равно " + a + " целых и " + b + " в остатке");
        System.out.println();
    }

    /* Блок 2 Задача *:
    Написать программу которая будет менять местами значение целочисленных переменных.
    Пример: int a = 1; int b = 2;//код (ваше решение) sout(a); //выведет 2 sout(b); //выведет 1*/
    public static void changeValue1() {
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println("Ответ  Блок - 2 Задача - *:");
        System.out.println("новое значение a – " + a);
        System.out.println("новое значение b – " + b);
        System.out.println();
    }

    /* Блок 2 Задача **:
     Усовершенствовать программу, использовать только 2 входные переменные (a,b);*/
    public static void changeValue2() {
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Ответ  Блок - 2 Задача - **:");
        System.out.println("новое значение a – " + a);
        System.out.println("новое значение b – " + b);
        System.out.println();
    }
}
