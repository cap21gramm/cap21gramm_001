package homework_009.homework_009_01;

public class Zadanie01 {

    /*    Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        который печатает название должности и имплементировать этот метод в созданные
        классы*/
    public static void main(String[] args) {

        Direktor direktor = new Direktor();
        Buhgalter buhgalter = new Buhgalter();
        Worker worker = new Worker();

        direktor.post();
        buhgalter.post();
        worker.post();
    }
}
