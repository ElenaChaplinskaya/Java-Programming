package by.itAcademy.Chaplinskaya.lesson8;

public class Person1 extends Person{
 String position;

    Person1(String name, int age, String education, int yearOfEmployment , String position) {
        super(name, age,education,yearOfEmployment);
        this.position = position;
    }

    @Override
    public int experience(int age) {
        return super.experience(age);
    }
}
