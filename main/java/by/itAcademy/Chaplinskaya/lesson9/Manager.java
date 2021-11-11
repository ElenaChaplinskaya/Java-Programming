package by.itAcademy.Chaplinskaya.lesson9;

public class Manager extends Administration {

    private int sales;

    public Manager(String fullName, String position, String typeOfSalary, double salInHour, int numberOfHoursWorked, int sales){
        super(fullName, position, typeOfSalary, salInHour, numberOfHoursWorked);
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public double getSalaryPerson() {
        return (super.getSalaryPerson()*sales/100)+super.getSalaryPerson();
    }


}
