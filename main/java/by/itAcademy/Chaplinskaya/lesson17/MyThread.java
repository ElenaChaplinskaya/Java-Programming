package by.itAcademy.Chaplinskaya.lesson17;

public class MyThread extends Thread {
    Object obj;
    public MyThread(Object obj) {
        this.obj = obj;
    }
    public void run() {
        synchronized (obj) {
            System.out.println(MyThread.currentThread().getName());
            try {
                MyThread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


