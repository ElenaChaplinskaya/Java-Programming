package by.itAcademy.Chaplinskaya.lesson19.task1;

public class MessengToTerminal extends MyLogger{

    public MessengToTerminal(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Log to terminal: " + message);
    }
}
