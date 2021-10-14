package by.itAcademy.Chaplinskaya.lesson3;

import java.util.Calendar;
import java.util.Random;

import static by.itAcademy.Chaplinskaya.secondLesson.Application.enterInteger;

public class App {
    public static void main(String[] args) {

        System.out.print("Выберите действие, которое нужно выполнить: \n" +
                "1. Если вы хотите проверить, попало ли случайное число в диапазон от 5-155, введите 1 \n" +
                "2. Если вы хотите определить возможность существования треугольника, введите 2 \n" +
                "3. Если вы хотите узнать, какой сегодня день недели, введите 3 \n");
        System.out.print("Введите число: ");

        int number = enterInteger();

        switch (number) {
            case 1:

                enterNum();
                break;
            case 2:
                System.out.println("Введите три числа:");
                int a = enterInteger();
                int b = enterInteger();
                int c = enterInteger();
                triangle(a, b, c);
                break;
            case 3:
                week();
                break;
            default:
                System.out.println("Вы сделали не правильный выбор!");
        }
    }

    public static void enterNum() {
        int min = 5;
        int max = 155;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        if (i >= 25 && i <= 100) {
            System.out.println("Ваше число " + i + " попадает в заданный интервал");
        } else {
            System.out.println("Ваше число " + i + " не попадает в заданный интервал");
        }
    }

    public static void triangle(int a, int b, int c) {

        if (a < b + c) {
            if (b < a + c) {
                if (c < a + b) {
                    System.out.println("Треугольник существует!");
                } else {
                    System.out.println("Треугольник не существует!");
                }
            } else {
                System.out.println("Треугольник не существует!");
            }
        } else {
            System.out.println("Треугольник не существует!");
        }
    }

    public static void week() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                System.out.println("Воскресенье");
                break;
            case 2:
                System.out.println("Понедельник");
                break;
            case 3:
                System.out.println("Вторник");
                break;
            case 4:
                System.out.println("Среда");
                break;
            case 5:
                System.out.println("Четверг");
                break;
            case 6:
                System.out.println("Пятница");
                break;
            case 7:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }
    }
}

