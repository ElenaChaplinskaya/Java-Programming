package by.itAcademy.Chaplinskaya.secondLesson;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.print("Введите целое число: ");
        System.out.println("Ваше число: " + enterInteger());

        System.out.print("Введите дробное число: ");
        System.out.println("Ваше число: " + enterFractional());

        enterName();

        System.out.print("Введите число: ");
        int num = enterInteger();
        System.out.println(squaring(num));

        System.out.print("Введите первое число: ");
        int num1 = enterInteger();
        System.out.print("Введите второе число: ");
        int num2 = enterInteger();
        System.out.println(average(num1, num2));

        System.out.print("Введите первое число: ");
        double num3 = enterFractional();
        System.out.print("Введите второе число: ");
        double num4 = enterFractional();
        System.out.print("Введите третье число: ");
        double num5 = enterFractional();
        System.out.println(average(num3, num4, num5));


        System.out.print("Определите конец диапазона:");
        int random = enterInteger();
        System.out.println(random(random));


    }

    public static int enterInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double enterFractional() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static String enterName() {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Ваше имя: " + name);
        return name;
    }

    public static int squaring(int number) {
        System.out.println("Квадрат числа: ");
        return number * number;
    }

    public static double average(int number1, int number2) {
        System.out.println("Среднее арифметическое: ");
        return (double) (number1 + number2) / 2;
    }

    public static double average(double number1, double number2, double number3) {
        System.out.println("Среднее арифметическое: ");
        return (number1 + number2 + number3) / 3;

    }

    public static int random(int number) {
        System.out.println("Ваше число: ");
        Random random = new Random();
        return random.nextInt(number);
    }
}
