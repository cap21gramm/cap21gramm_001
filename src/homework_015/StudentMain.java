package homework_015;

import java.util.*;

public class StudentMain {
/*    Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
    оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
    Написать метод, который удаляет студентов со средним баллом <3. Если средний
    балл>=3, студент переводится на следующий курс. Дополнительно написать метод
    printStudents(List<Student> students, int course), который получает список студентов и
    номер курса. А также печатает на консоль имена тех студентов из списка, которые
    обучаются на данном курсе*/

    public static void main(String[] args) {
        Map<String, Integer> grades1 = Map.of("МатАн", 2, "ЛинАл", 3, "ТВиМС", 3);
        Student s1 = new Student("Пушкин Александр", "Группа 106", 1, grades1);

        Map<String, Integer> grades2 = Map.of("МатАн", 3, "ЛинАл", 3, "ТВиМС", 4);
        Student s2 = new Student("Толстой Алексей", "Группа 106", 1, grades2);

        Map<String, Integer> grades3 = Map.of("МатАн", 3, "ЛинАл", 2, "ТВиМС", 5);
        Student s3 = new Student("Достоевский Федор", "Группа 106", 1, grades3);

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3));

        System.out.println("Начальный список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();
        StudentManag.updateStudents(students);
        System.out.println("Список студентов на перевод на след курс:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\n");
        StudentManag.printStudents(students, 1);
        StudentManag.printStudents(students, 2);
        StudentManag.printStudents(students, 3);
    }
}