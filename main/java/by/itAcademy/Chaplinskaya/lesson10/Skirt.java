package by.itAcademy.Chaplinskaya.lesson10;

public class Skirt extends Clothing implements WomensClothing{

    Skirt(int s, double p, String c) {
        super(s, p, c);
    }

    @Override
    public void dressAWoman() {
        System.out.println(getSize()+" " + getPrice()+ " " +getColor());

    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
