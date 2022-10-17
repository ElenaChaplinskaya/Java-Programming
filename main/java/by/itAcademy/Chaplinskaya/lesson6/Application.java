package by.itAcademy.Chaplinskaya.lesson6;

import java.util.Random;

import static by.itAcademy.Chaplinskaya.lesson5.Application.printArray;
import static by.itAcademy.Chaplinskaya.lesson6.Customer.ageCustomer;
import static by.itAcademy.Chaplinskaya.lesson2.Application.enterInteger;

public class Application {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        printArray(array);
        System.out.println();
        getTheGreatestNumbers(array);

        int[][] array1 = {{1, 2, 3, 4}, {4, 5, 6, 7}, {8, 8, 8, 8}};
        System.out.println("\nВведите номер строки и колонки:");
        int line = enterInteger();
        int column = enterInteger();
        getLineAndColumn(array1, line, column);
        System.out.println();

        Children children = new Children();
        children.getInfo();

        Children children1 = new Children("Tony", "Mony", 15);
        children1.setName("Loly");
        children1.setSecondName("Poly");
        children1.setAge(14);
        System.out.println(children1.getName() + " " + children1.getSecondName() + " " + children1.getAge());

        Customer[] customer = new Customer[3];
        customer[0] = new Customer("Добрый Добрыня Никитич", 1968, 121, "abc");
        customer[1] = new Customer("Попов Алеша Попович", 1972, 345, "def");
        customer[2] = new Customer("Муромской Илья Муровец", 1988, 671, "zzz");
        for (int i = 0; i < customer.length; i++) {

            if (customer[i].getCard() % 10 == 1) {
                System.out.println(customer[i].getName());
            }
        }
        System.out.println(ageCustomer(customer[0]));
    }

    public static void getTheGreatestNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void getLineAndColumn(int[][] array1, int line, int column) {
        for (int i = 0; i < array1.length + 1; i++) {
            System.out.print(array1[line - 1][i] + " ");
        }
        System.out.println();
        for (int j = 0; j < array1[0].length - 1; j++) {
            System.out.print(array1[j][column - 1] + " ");
        }
    }
}

