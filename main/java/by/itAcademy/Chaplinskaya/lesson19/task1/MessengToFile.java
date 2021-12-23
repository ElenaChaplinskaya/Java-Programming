package by.itAcademy.Chaplinskaya.lesson19.task1;

public class MessengToFile extends MyLogger{

    public MessengToFile(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Log to file: " + message);
    }
}
