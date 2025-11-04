package homework_009.homework_009_02;

public class Rectangle extends Figura {
    private double a, b;
    private boolean x = true;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

        if (a <= 0 || b <= 0) {
            x = false;
            System.out.println("Прямоугольник с заданными сторонами не может существовать");
        } else return;
    }

    public boolean isValid() {
        return x;
    }

    public double getPerimetr() {
        return (a + b) * 2;
    }

    public double getArea() {
        return a * b;
    }
}
