package homework_010;

public class HomeWork_010 {
/*    Создать класс для описания пользователя системы. Переопределить в классе методы
    toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
    значением полей и сравнить с помощью метода equals*/

    public static void main(String[] args) {
        User user1 = new User(1, "Aleksand Pushkin", "apushka", "apushka@mail.ru",
                "Male", 32);
        User user2 = new User(2, "Sergey Esenin", "senya", "Esen1n@mail.ru", "Male",
                25);

        System.out.println(user1);
        System.out.println(user1.hashCode());
        System.out.println();
        System.out.println(user2);
        System.out.println(user2.hashCode());
        System.out.println();


        User user3 = new User(2, "Sergey Esenin", "senya", "Esen1n@mail.ru", "Male",
                25);
        User user4 = new User(2, "Sergey Esenin", "senya", "Esen1n@mail.ru", "Male",
                25);

        System.out.println(user3);
        System.out.println(user3.hashCode());
        System.out.println();
        System.out.println(user4);
        System.out.println(user4.hashCode());


        System.out.println();
        System.out.println(user4.equals(user1));
        System.out.println(user4.equals(user2));
        System.out.println(user4.equals(user3));
    }
}
