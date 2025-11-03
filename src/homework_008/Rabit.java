package homework_008;

public class Rabit extends Animal {
    @Override
    public void voice() {
        System.out.println("не знаю как кролики кричат..");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("Кролики любят траву");
        } else {
            System.out.println("Кролики не любят мясо, они любят траву");
        }
    }
}

