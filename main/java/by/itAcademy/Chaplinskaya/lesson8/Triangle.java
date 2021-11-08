package by.itAcademy.Chaplinskaya.lesson8;

public class Triangle extends Figures{
    int c=1;

    @Override
    public int square(int a, int b) {
        return super.square(a, b)/2;
    }

    @Override
    public int perimeter(int a, int b) {
        return a+b+c;
    }
}
