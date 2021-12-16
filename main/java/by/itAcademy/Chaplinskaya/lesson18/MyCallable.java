package by.itAcademy.Chaplinskaya.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public String call() throws Exception {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50));
            sum = +list.get(i);
        }
        Thread.sleep(5000);
        return Thread.currentThread().getName() + " " + sum.toString();
    }
}
