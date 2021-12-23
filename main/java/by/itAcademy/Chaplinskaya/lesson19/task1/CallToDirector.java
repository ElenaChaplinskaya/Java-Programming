package by.itAcademy.Chaplinskaya.lesson19.task1;

import java.util.logging.Logger;

public class CallToDirector extends MyLogger{

    Logger logger = Logger.getLogger("Call");


    public CallToDirector(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Call to director: " + message);
    }
}
