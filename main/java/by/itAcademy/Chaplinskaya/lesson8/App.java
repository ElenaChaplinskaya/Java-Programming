package by.itAcademy.Chaplinskaya.lesson8;

public class App {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println("Площадь квадрата равна:" + square.square(2, 2));
        System.out.println("Периметр квадрата равна:" + square.perimeter(2, 2));

        Straight straight = new Straight();
        System.out.println("Площадь прямоугольника равна:" + straight.square(2, 3));
        System.out.println("Периметр прямоугольник равна:" + straight.perimeter(2, 3));

        Triangle triangle = new Triangle();
        System.out.println("Площадь треугольника равна:" + triangle.square(2, 3));
        System.out.println("Периметр треугольника равна:" + triangle.perimeter(2, 3));

        Person1 person1 = new Person1("Лена", 31, "Высшее", 2010, "Бухгалтер");
        System.out.println(person1.getName()+","+person1.getAge()+","+person1.getEducation()+","+person1.getYearOfEmployment()+","+person1.position);
        System.out.println("Общий стаж составляет:"+person1.experience(2010));

        Person1 person11 = new Person1("Максим", 32, "Высшее", 2019, "Менеджер");
        System.out.println(person11.getName()+","+person11.getAge()+","+person11.getEducation()+","+person11.getYearOfEmployment()+","+person11.position);
        System.out.println("Общий стаж составляет:"+person1.experience(2019));

        Person2 person2 = new Person2("Иван", 25, "Высшее", 2018, 100.00 +"руб.");
        System.out.println(person2.getName()+","+person2.getAge()+","+person2.getEducation()+","+person2.getYearOfEmployment()+","+person2.salary);
        System.out.println("Общий стаж составляет:"+person2.experience(2018));
    }


}
