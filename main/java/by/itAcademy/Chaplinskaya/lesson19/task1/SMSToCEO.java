package by.itAcademy.Chaplinskaya.lesson19.task1;

public class SMSToCEO extends MyLogger{

    public SMSToCEO(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS to CEO: " + message);
    }
}
