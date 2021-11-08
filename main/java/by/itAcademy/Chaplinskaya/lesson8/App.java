package by.itAcademy.Chaplinskaya.lesson8;

public class App {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println("Площадь квадрата равна:" + square.square(2, 2));
        System.out.println("Периметр квадрата равна:" + square.perimeter(2, 2));

        Straight straight= new Straight();
        System.out.println("Площадь прямоугольника равна:" + straight.square(2, 3));
        System.out.println("Периметр прямоугольник равна:" + straight.perimeter(2, 3));

        Triangle triangle=new Triangle();
        System.out.println("Площадь треугольника равна:" + triangle.square(2, 3));
        System.out.println("Периметр прямоугольник равна:" + triangle.perimeter(2, 3));
    }


}
