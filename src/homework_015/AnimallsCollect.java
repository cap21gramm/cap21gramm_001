package homework_015;

import java.util.LinkedList;

public class AnimallsCollect {

/*    Задача 2:
    Создать класс, который будет хранить в себе коллекцию с названиями животных.
    Реализовать методы удаления и добавления животных по следующим правилам:
    добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
    объекта этого класса в main методе другого класса*/

    private LinkedList<String> animals;

    public AnimallsCollect() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public String delAnimal() {
        String dell = animals.removeLast();  // Удаляем с конца
        return dell;
    }

    public void printCollect() {
        System.out.println(animals);
    }
}
