package homework_008;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собаки говорят: Гав-гав");
    }
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Собаки любят мясо");
        } else {
            System.out.println("Собакам не нравится трава, они любят мясо");
        }
    }
}
