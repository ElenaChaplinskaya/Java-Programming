package by.itAcademy.Chaplinskaya.lesson4;

import static by.itAcademy.Chaplinskaya.secondLesson.Application.enterInteger;

public class App {
    public static void main(String[] args) {

        System.out.print("Введите целое число: ");
        int number = enterInteger();
        System.out.println(getSumNumber(number));

        if (simpleNumber(number)) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }

        System.out.println(evenNumber(number));
        subsequence();
        System.out.println(factorial(number));
    }

    public static int getSumNumber(int num) {
        int sum = num;
        if (num >= 1) {
            for (int i = 1; i < num; i++) {
                sum += i;
            }
        } else {
            System.out.println("Введенное число должно быть положительным!");
        }
        return sum;
    }

    public static boolean simpleNumber(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }

    }

    public static String evenNumber(int num) {
        int i = num;
        String answer = i % 2 == 0 ? "четное" : "нечетное";
        return answer;
    }

    public static void subsequence() {
        int num = 90;
        for (int i = 90; i >= 0; i = i - 5) {
            num -= 5;
            System.out.println(num);
        }
    }

    public static int factorial(int num) {
        int result = 1;
        if (num == 1 || num == 0) {
            return result;
        }
        result = num * factorial(num - 1);
        return result;
    }
}
