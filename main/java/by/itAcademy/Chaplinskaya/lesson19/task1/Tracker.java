package by.itAcademy.Chaplinskaya.lesson19.task1;

public class Tracker {
    public static void main(String[] args) {
        MyLogger reportDebug = new MessengToTerminal(Levels.DEBUG);
        MyLogger reportInfo = new MessengToFile(Levels.INFO);
        MyLogger reportError = new SMSToCEO(Levels.ERROR);
        MyLogger reportFatal = new CallToDirector(Levels.FATAL);

        reportFatal.setNext(reportError);
        reportError.setNext(reportInfo);
        reportInfo.setNext(reportDebug);

        reportDebug.notifyManager("Debug", Levels.DEBUG);
        System.out.println();
        reportInfo.notifyManager("Info", Levels.INFO);
        System.out.println();
        reportError.notifyManager("Error", Levels.ERROR);
        System.out.println();
        reportFatal.notifyManager("Fatal", Levels.FATAL);
    }
}
