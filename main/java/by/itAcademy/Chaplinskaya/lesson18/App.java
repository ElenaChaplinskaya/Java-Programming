package by.itAcademy.Chaplinskaya.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<Integer>> list = new ArrayList<Future<Integer>>();

        Callable<Integer> callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(callable);
            list.add(future);
        }

        for (Future<Integer> f : list) {
            System.out.println(f.get());
        }
        executor.shutdown();
    }
}
