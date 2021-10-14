package by.itAcademy.Chaplinskaya.extraWork;

import java.util.Scanner;

public class AppExtra {
    public static void main(String[] args) {
        comparison(10, 5);
        division();

    }

    public static void comparison(int number1, int number2) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = number1 - n == number2;
        System.out.println(result);
    }

    public static void division() {
        System.out.print("Введите первое число: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();
        boolean result = number1 % number2 == 0;
        System.out.println(result);

    }
}
