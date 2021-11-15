package by.itAcademy.Chaplinskaya.lesson3;

import java.util.Calendar;
import java.util.Random;

import static by.itAcademy.Chaplinskaya.lesson2.Application.enterInteger;

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
                System.out.println(week());
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

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Треугольник существует!");
        } else {
            System.out.println("Треугольник не существует!");
        }
    }

    public static String week() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String nameDay = "";
        switch (dayOfWeek) {
            case 1:
                nameDay = "Воскресенье";
                break;
            case 2:
                nameDay = "Понедельник";
                break;
            case 3:
                nameDay = "Вторник";
                break;
            case 4:
                nameDay = "Среда";
                break;
            case 5:
                nameDay = "Четверг";
                break;
            case 6:
                nameDay = "Пятница";
                break;
            case 7:
                nameDay = "Суббота";
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }
        return nameDay;
    }
}

