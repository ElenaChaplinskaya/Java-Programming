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



//       double salary = 0;
//        switch (typeOfSalary) {  // как свитч узнает тип моей зп?
//            case 1:
//                double hourlyWage = hours * salInHour;
//                break;
//            case 2:
//                double piecework = numberOfProduct * pieceRate;
//                break;
//            default:
//                if (numberOfProduct > 1000) {
//                    double mixed = numberOfProduct * pieceRate * 0.3;
//                }
//        }
//        return salary;

}
