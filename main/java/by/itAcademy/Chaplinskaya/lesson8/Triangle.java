package by.itAcademy.Chaplinskaya.lesson8;

public class Triangle extends Figures {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int square() {
        return a * b / 2;
    }

    public int perimeter() {
        return a + b + c;
    }
}

