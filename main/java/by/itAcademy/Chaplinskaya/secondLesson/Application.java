package by.itAcademy.Chaplinskaya.secondLesson;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        enterInteger();
        enterFractional();
        enterName();

        int result = squaring();
        System.out.println(result);


        System.out.print("Введите первое число: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();
        System.out.print("Среднее арифметическое: ");
        double result1 = average(number1, number2);
        System.out.println(result1);

        double result2 = average();
        System.out.println(result2);

        System.out.println(random());


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

    public static int squaring() {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Квадрат числа: ");
        return number * number;
    }

    public static double average(int number1, int number2) {
        return (double) (number1 + number2) / 2;
    }

    public static double average() {
        System.out.print("Введите первое число: ");
        Scanner scanner1 = new Scanner(System.in);
        double number1 = scanner1.nextDouble();
        System.out.print("Введите второе число: ");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();
        System.out.print("Введите третье число: ");
        Scanner scanner3 = new Scanner(System.in);
        double number3 = scanner3.nextDouble();
        System.out.print("Среднее арифметическое: ");
        return (number1 + number2 + number3) / 3;

    }

    public static int random() {
        System.out.print("Определите конец диапазона: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Ваше число: ");
        Random random = new Random();
        return random.nextInt(number);
    }
}
