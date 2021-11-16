package by.itAcademy.Chaplinskaya.lesson9;

public class ExternalWorker extends Workers{


    public ExternalWorker(String fullName, String position, String typeOfSalary, int numberOfProduct, double pieceRate) {
        super(fullName, position, typeOfSalary, numberOfProduct, pieceRate);
    }

    @Override
    public double getSalaryPerson(){
       if(super.getNumberOfProduct()> 500) {
           return (super.getSalaryPerson() * 20 / 100) + super.getSalaryPerson();
       }else{
       }
        return super.getSalaryPerson();
    }
}
