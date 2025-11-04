package homework_009.homework_009_02;

public class Krug extends Figura {
    private double r;
    private boolean x = true;

    public Krug(double r) {
        this.r = r;
        if (r <= 0) {
            x = false;
            System.out.println("Круг с заданным радиусом не может существовать");
        } else return;
    }

    public boolean isValid() {
        return x;
    }

    public double getPerimetr() {
        return 2 * r * Math.PI;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
