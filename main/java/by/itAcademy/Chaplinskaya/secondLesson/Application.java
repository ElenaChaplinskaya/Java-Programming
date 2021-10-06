package by.itAcademy.Chaplinskaya.secondLesson;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        enterInteger();
        enterFractional();
        enterName();
        squaring(5);
        average(5, 6);
        newAverage(1.5, 2.5, 3.0);
        random();


    }

    public static int enterInteger() {
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Ваше число: " + number);
        return number;
    }

    public static double enterFractional() {
        System.out.print("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println("Ваше число: " + number);
        return number;
    }

    public static String enterName() {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Ваше имя: " + name);
        return name;
    }

    public static int squaring(int number) {
        int result = number * number;
        System.out.println(result);
        return result;
    }

    public static double average(int number1, int number2) {
        double result = (double) (number1 + number2) / 2;
        System.out.println(result);
        return result;
    }

    public static double newAverage(double number1, double number2, double number3) {
        double result = (number1 + number2 + number3) / 3;
        System.out.println(result);
        return result;
    }

    public static int random() {
        Random random = new Random();
        int result = random.nextInt(50);
        System.out.println(result);
        return result;
    }
}
