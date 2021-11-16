package by.itAcademy.Chaplinskaya.lesson10;

public class Tshirt extends Clothing implements MensClothing,WomensClothing{

    Tshirt(int s, double p, String c) {
        super(s, p, c);
    }

    /*
    реализовать интерфейс означает, реализовать метод из интерфейса.
    но зачем он нам, если он не работает и работать не будет. я не могу (или не умею)
    в классе Studio в методе dressAMen/Women в строку 8 и 15 добавить этот метод. Получится рекурсия.
    поэтому переопределила метод тустринг. Получается отступление от задания*/
    @Override
    public void dressAMan() {
        System.out.println("Мужчина одет"+getSize()+" " + getPrice()+ " " +getColor());

    }

    @Override
    public void dressAWoman() {
        System.out.println("Женщина одета"+getSize()+" " + getPrice()+ " " +getColor());

    }

    @Override
    public String toString() {
        return "Tshirt{} " + super.toString();
    }
}
