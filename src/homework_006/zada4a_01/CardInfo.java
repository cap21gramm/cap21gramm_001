package homework_006.zada4a_01;

public class CardInfo {
    public String cardNumber;
    public String nameOwner;
    public String surnameOwner;
    public int monthValid;
    public int yearValid;
    public double money;

    public void putMoney(double dopmoney) {
        if (dopmoney <= 0) {
            System.out.println("Ошибка ввода денег, попробуйте снова");
        } else {
            money = money + dopmoney;
            System.out.println("Вы добавили на свой счет " + dopmoney + " Обновленный баланс будет равен " + money);
        }
    }

    public void getMoney(double dopmoney) {
        if (dopmoney <= 0) {
            System.out.println("Ошибка ввода денег, попробуйте снова");
        } else if ((money - dopmoney) < 0) {
            System.out.println("На балансе недостаточно денег, снятие указанной суммы невозможно.");
            System.out.println("Ваш баланс " + money);
        } else {
            money = money - dopmoney;
            System.out.println("Вы сняли " + dopmoney);
            System.out.println("Остаток на карте " + money);
        }
    }

    public void getInfoCard() {
        System.out.println("параметры карты: ");
        System.out.println("\tномер кредитной карты: " + cardNumber);
        System.out.println("\tимя владельца: " + nameOwner);
        System.out.println("\tфамилия влдаельца: " + surnameOwner);
        System.out.println("\tсрок действия: " + monthValid + "/" + yearValid);
        System.out.println("\tбаланс: " + money);
    }
}

