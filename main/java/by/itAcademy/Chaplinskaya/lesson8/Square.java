package by.itAcademy.Chaplinskaya.lesson8;

import static java.lang.System.*;

public class Square extends Figures {
    int a;

    public Square(int a) {
        this.a = a;
    }

    public int square() {
        return a * a;
    }

    public int perimeter() {
        return a * 4;
    }

}
