package homework_006.zada4a_01;

public class CreditCard {

    /*    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    выводит текущую информацию о карточке. Напишите программу, которая создает три
    объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    третьей. Выведите на экран текущее состояние всех трех карточек*/

    public static void main(String[] args) {
        createCreditCard();
    }

    public static void createCreditCard() {
        CardInfo visa = new CardInfo();

        visa.cardNumber = "0123456789";
        visa.nameOwner = "DMITRY";
        visa.surnameOwner = "IVANOV";
        visa.monthValid = 8;
        visa.yearValid = 2025;
        visa.money = 1255.2;
        visa.getInfoCard();
        visa.putMoney(256.2);


        CardInfo mir = new CardInfo();
        System.out.println();
        mir.cardNumber = "12564897498";
        mir.nameOwner = "ALEXEY";
        mir.surnameOwner = "PUSHKIN";
        mir.monthValid = 4;
        mir.yearValid = 2030;
        mir.money = 12313.2;
        mir.getInfoCard();
        mir.putMoney(-20.2);


        CardInfo master = new CardInfo();
        System.out.println();
        master.cardNumber = "897421215";
        master.nameOwner = "VASILIY";
        master.surnameOwner = "PETROV";
        master.monthValid = 2;
        master.yearValid = 2027;
        master.money = 12.2;
        master.getInfoCard();
        master.getMoney(2);

    }
}
