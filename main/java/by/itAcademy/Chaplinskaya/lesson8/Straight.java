package by.itAcademy.Chaplinskaya.lesson8;

public class Straight extends Figures {
    private int a;
    private int b;

    public Straight(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int square() {
        return a * b;
    }

    public int perimeter() {
        return a * 2 + b * 2;
    }
}
