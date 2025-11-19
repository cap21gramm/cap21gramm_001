package homework_013;

import java.util.Scanner;

public class HomeWork_013 {
    public static void main(String[] args) {

/*    Создать класс, в котором будет статический метод. Этот метод принимает на вход три
    параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
    login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
    соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
    password должна быть меньше 20 символов, не должен содержать пробелом и должен
    содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
    Если password не соответствует этим требованиям, необходимо выбросить
    WrongPasswordException. WrongPasswordException и WrongLoginException -
    пользовательские классы исключения с двумя конструкторами – один по умолчанию,
    второй принимает сообщение исключения и передает его в конструктор класса Exception.
    Метод возвращает true, если значения верны, false в противном случае*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        try {
            Validator.validateLogin(login);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина: " + e.getMessage());
            return;
        }

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        try {
            Validator.validatePass(password);
        } catch (WrongPassException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();
        try {
            Validator.validatePassConf(password, confirmPassword);
        } catch (WrongPassException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Регистрация прошла успешно");
        System.out.println("\tВаш логин: " + login);
        System.out.println("\tВаш пароль: " + password);
    }
}