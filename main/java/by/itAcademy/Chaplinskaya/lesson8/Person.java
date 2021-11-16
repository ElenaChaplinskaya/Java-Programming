package by.itAcademy.Chaplinskaya.lesson8;

import java.time.Year;

public class Person {
    private String name;
    private int age;
    private String education;
    private int yearOfEmployment;

    Person(String name, int age, String education, int yearOfEmployment) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int experience(int dateOfEmployment) {
        int year = Year.now().getValue();
        int exp = year - dateOfEmployment;
        return exp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public String getEducation() {
        return education;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }
}
