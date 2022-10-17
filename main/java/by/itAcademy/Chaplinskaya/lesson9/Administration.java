package by.itAcademy.Chaplinskaya.lesson9;

public class Administration extends Fabric {

    private int numberOfHoursWorked;
    private double salInHour;

    public Administration(String fullName, String position, String typeOfSalary, double salInHour, int numberOfHoursWorked) {
        super(fullName, position, typeOfSalary);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.salInHour = salInHour;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getSalInHour() {
        return salInHour;
    }

    public void setSalInHour(double salInHour) {
        this.salInHour = salInHour;
    }

@Override
    public double getSalaryPerson() {
        return getNumberOfHoursWorked()*getSalInHour();
    }
}
