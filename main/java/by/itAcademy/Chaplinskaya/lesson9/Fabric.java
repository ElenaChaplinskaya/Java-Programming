package by.itAcademy.Chaplinskaya.lesson9;

public abstract class Fabric {
    private String fullName;
    private String position;
    private String typeOfSalary;

    public Fabric(String fullName, String position, String typeOfSalary) {
        this.fullName = fullName;
        this.position = position;
        this.typeOfSalary = typeOfSalary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTypeOfSalary() {
        return typeOfSalary;
    }

    public void setTypeOfSalary(String typeOfSalary) {
        this.typeOfSalary = typeOfSalary;
    }

    public abstract double getSalaryPerson();

}
