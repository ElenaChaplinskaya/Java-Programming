package by.itAcademy.Chaplinskaya.lesson17;

public class Application {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}







