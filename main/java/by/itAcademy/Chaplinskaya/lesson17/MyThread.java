package by.itAcademy.Chaplinskaya.lesson17;

public class MyThread extends Thread {


    public synchronized void run() {
        System.out.println(MyThread.currentThread().getName());
        try {
            MyThread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


