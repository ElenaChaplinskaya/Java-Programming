package by.itAcademy.Chaplinskaya.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static by.itAcademy.Chaplinskaya.lesson11.Student.printStudents;
import static by.itAcademy.Chaplinskaya.lesson11.Student.removeStudent;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 1, Arrays.asList(2, 5, 8, 6)));
        students.add(new Student("Mom", 2, Arrays.asList(2, 2, 2, 2)));
        students.add(new Student("Bom", 3, Arrays.asList(2, 1, 3, 1)));
        students.add(new Student("Dom", 1, Arrays.asList(2, 5, 7, 6)));
        students.add(new Student("Fom", 5, Arrays.asList(2, 5, 8, 6)));


        removeStudent(students);
        printStudents(students, 2);

    }
}
