package homework_009.homework_009_02;

import java.util.Scanner;

public class Treugolnik extends Figura {
    private double a, b, c;
    private boolean x = true;

    public Treugolnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a > b + c || b > a + c || c > a + b || a <= 0 || b <= 0 || c <= 0) {
            x = false;
            System.out.println("Треугольник с заданными сторонами не может существовать");
        }
    }

    public boolean isValid() {
        return x;
    }

    public double getPerimetr() {
        return a + b + c;
    }

    public double getArea() {
        double p = (getPerimetr() / 2);
        return (Math.sqrt((p - a) * (p - b) * (p - c) * p));
    }
}
