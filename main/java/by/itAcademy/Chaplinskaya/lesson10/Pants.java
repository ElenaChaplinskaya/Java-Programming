package by.itAcademy.Chaplinskaya.lesson10;

public class Pants extends Clothing implements MensClothing, WomensClothing{

    Pants(int s, double p, String c) {
        super(s, p, c);
    }

    @Override
    public void dressAMan() {
        System.out.println(getSize()+" " + getPrice()+ " " +getColor());

    }

    @Override
    public void dressAWoman() {
        System.out.println(getSize()+" " + getPrice()+ " " +getColor());

    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }
}
