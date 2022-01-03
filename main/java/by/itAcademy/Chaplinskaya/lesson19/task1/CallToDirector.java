package by.itAcademy.Chaplinskaya.lesson19.task1;

public class CallToDirector extends MyLogger{

    public CallToDirector(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Call to director: " + message);
    }
}
