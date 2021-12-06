package by.itAcademy.Chaplinskaya.lesson15;

import java.util.Random;

public class NewThread extends Thread {
    public void run() {
        Random random = new Random();
        int[] myArray = new int[10];

        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(20);
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Имя потока:" + getName() + ", максимальный элемент:" + max);
    }
}
