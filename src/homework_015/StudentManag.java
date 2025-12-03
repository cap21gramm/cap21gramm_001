package homework_015;

import java.util.Iterator;
import java.util.List;

public class StudentManag {

    public static void updateStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avg = student.calcMidGrade();
            if (avg < 3.0) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("\t- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t- на курсе нет студентов");
        }
    }
}
