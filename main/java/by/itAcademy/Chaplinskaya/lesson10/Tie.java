package by.itAcademy.Chaplinskaya.lesson10;

public class Tie extends Clothing implements MensClothing {

    Tie(int s, double p, String c) {
        super(s, p, c);
    }

    @Override
    public void dressAMan() {
        System.out.println(getSize()+" " + getPrice()+ " " +getColor());

    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
