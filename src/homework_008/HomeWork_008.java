package homework_008;

public class HomeWork_008 {

  /*  Задача 1:
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    Переопределить методы voice(), eat(String food) чтобы они выводили верную
    информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
            Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    или другую строку то он будет недоволен*/

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabit = new Rabit();

        System.out.println("Собака");
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        System.out.println();


        System.out.println("Тигр");
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        System.out.println();

        System.out.println("Кролики");
        rabit.voice();
        rabit.eat("Meat");
        rabit.eat("Grass");
        System.out.println();

    }
}
