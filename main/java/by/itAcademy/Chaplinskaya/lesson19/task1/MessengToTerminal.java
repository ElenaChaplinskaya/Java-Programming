package by.itAcademy.Chaplinskaya.lesson19.task1;

import java.util.logging.Logger;

public class MessengToTerminal extends MyLogger{
    Logger log = Logger.getLogger("Mess");

    public MessengToTerminal(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Log to terminal: " + message);
    }
}
