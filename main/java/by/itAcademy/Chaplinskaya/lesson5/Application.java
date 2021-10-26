package by.itAcademy.Chaplinskaya.lesson5;

import static by.itAcademy.Chaplinskaya.secondLesson.Application.enterInteger;

public class Application {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        System.out.println(days[6]);

        System.out.print("Задача 2 \nВведите элементы массива: ");

        int[] array = new int[5];
        array[0] = enterInteger();
        array[1] = enterInteger();
        array[2] = enterInteger();
        array[3] = enterInteger();
        array[4] = enterInteger();

        double sum = getAverage(array);
        System.out.println("Среднее арифметическое: " + sum);
        System.out.print("Минимальные элементы массива: ");
        getMinElement(array, sum);

        System.out.println("\nЗадача 3");
        System.out.println("Введите длину массива:");
        int length = enterInteger();
        int [] mass = fillArray(length);
        printArray(mass);
        System.out.println("\nВведите индекс и число:");
        int index = enterInteger();
        int element = enterInteger();

        printArray(newArray(mass, element, index));

        int[][] array1 = {{1, 2, 55}, {4, 5, 66}};
        System.out.println("\nЗадача 4 \nМаксимальное число: ");
        System.out.println(maxElement(array1));
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public static void getMinElement(int[] array, double sum) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < sum) {
                min = array[i];
            } else {
                continue;
            }
            System.out.print(min + " ");
        }
    }

    public static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length - 1; i++) {
            System.out.print("Введите элемент под индексом " + i + ": ");
            array[i] = enterInteger();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] newArray(int[] array, int element, int index) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }
        return newArray;
    }

    public static int maxElement(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

}




