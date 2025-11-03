package homework_008;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигры говорят: Рррррр....");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Тигры любят мясо");
        } else {
            System.out.println("Тиграм не нравится трава, они любят мясо");
        }
    }
}
