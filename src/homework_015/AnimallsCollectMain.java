package homework_015;

public class AnimallsCollectMain {
    public static void main(String[] args) {
        AnimallsCollect animallsCollect = new AnimallsCollect();

        animallsCollect.addAnimal("Хомяк");
        animallsCollect.addAnimal("Пес");
        animallsCollect.addAnimal("Кот");
        animallsCollect.addAnimal("Рыба");
        animallsCollect.printCollect();

        System.out.println();
        animallsCollect.addAnimal("Корова");
        animallsCollect.addAnimal("Свинья");
        animallsCollect.printCollect();

        System.out.println();
        animallsCollect.delAnimal();
        animallsCollect.printCollect();
    }
}
