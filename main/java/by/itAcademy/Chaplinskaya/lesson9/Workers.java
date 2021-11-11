package by.itAcademy.Chaplinskaya.lesson9;

public class Workers extends Fabric {

    private int numberOfProduct;
    private double pieceRate;

    public Workers(String fullName, String position, String typeOfSalary, int numberOfProduct, double pieceRate) {
        super(fullName, position, typeOfSalary);
        this.numberOfProduct = numberOfProduct;
        this.pieceRate = pieceRate;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public double getPieceRate() {
        return pieceRate;
    }

    public void setPieceRate(double pieceRate) {
        this.pieceRate = pieceRate;
    }

    @Override
    public double getSalaryPerson() {
        return numberOfProduct*pieceRate;
    }
}
