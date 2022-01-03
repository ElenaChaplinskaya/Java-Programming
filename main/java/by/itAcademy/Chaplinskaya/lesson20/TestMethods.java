package by.itAcademy.Chaplinskaya.lesson20;

import java.time.LocalDate;

public class TestMethods {

    @AcademyInfo(year = 1990)
    public static void getMyAge(int year) {
        System.out.println(LocalDate.now().getYear() - year);
    }

    public static void getAge(int year) {
        System.out.println(LocalDate.now().getYear() - year);
    }
}
