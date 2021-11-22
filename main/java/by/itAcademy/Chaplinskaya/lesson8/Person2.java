package by.itAcademy.Chaplinskaya.lesson8;

public class Person2 extends Person{
   String salary;


    Person2(String name, int age, String education, int yearOfEmployment, String salary) {
        super(name, age, education, yearOfEmployment);
        this.salary=salary;

    }

    @Override
    public int experience(int age) {
        return super.experience(age);
    }
}
