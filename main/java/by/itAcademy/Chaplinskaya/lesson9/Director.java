package by.itAcademy.Chaplinskaya.lesson9;

public class Director extends Administration {

    private int premium;

    public Director(String fullName, String position, String typeOfSalary, double salInHour, int numberOfHoursWorked, int premium) {
        super(fullName, position, typeOfSalary, salInHour, numberOfHoursWorked);
        this.premium = premium;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    @Override
    public double getSalaryPerson() {
        return (super.getSalaryPerson() * premium / 100) + super.getSalaryPerson();
    }
}
