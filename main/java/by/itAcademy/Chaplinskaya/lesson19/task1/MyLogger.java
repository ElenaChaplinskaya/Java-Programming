package by.itAcademy.Chaplinskaya.lesson19.task1;

public abstract class MyLogger {

    private int level;
    private MyLogger next;

    public MyLogger(int level) {
        this.level = level;
    }

    public void setNext(MyLogger next) {
        this.next = next;
    }

    public void notifyManager(String message,int level) {
        if (this.level>=level) {
            write(message);
        }
        if (next != null) {
            next.notifyManager(message, level);
        }
    }

    public abstract void write(String message);

}
