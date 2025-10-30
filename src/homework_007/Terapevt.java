package homework_007;

import java.util.Scanner;

public class Terapevt extends Doctor {
    @Override
    void heal() {
        System.out.println("Терапевт возможно даст таблетки и отправит домой с больничным");
    }

    public void getPlan(Pacient pacient) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код плана лечения");
        int plan = sc.nextInt();


        Doctor getDoc;
        if (plan == 1) {
            getDoc = new Herurg();
            System.out.println("Пациента отправили к херургу");
        } else if (plan == 2) {
            getDoc = new Dantist();
            System.out.println("Пациента отправили к дантисту");
        } else {
            getDoc = new Terapevt();
            System.out.println("Пациент остался у терапевта.. ");
        }
        pacient.setDoc(getDoc);
        getDoc.heal();
    }
}

