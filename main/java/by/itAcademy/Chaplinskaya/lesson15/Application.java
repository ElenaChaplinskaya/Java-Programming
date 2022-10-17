package by.itAcademy.Chaplinskaya.lesson15;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class Application {
    public static void main(String[] args) throws JAXBException {


        File file = new File("main/java/by/itAcademy/Chaplinskaya/lesson15/persons.xml");

        JAXBContext jabxContext = JAXBContext.newInstance(Persons.class);
        Unmarshaller unmarshaller = jabxContext.createUnmarshaller();

        Persons persons = (Persons) unmarshaller.unmarshal(file);
        System.out.println(persons);

        NewThread newThread = new NewThread();
        newThread.start();

        NewThread newThread1 = new NewThread();
        newThread1.start();

        NewThread newThread2 = new NewThread();
        newThread2.start();

        NewThread newThread3 = new NewThread();
        newThread3.start();

        NewThread newThread4 = new NewThread();
        newThread4.start();

        NewThread newThread5 = new NewThread();
        newThread5.start();

        NewThread newThread6 = new NewThread();
        newThread6.start();

        NewThread newThread7 = new NewThread();
        newThread7.start();

        NewThread newThread8 = new NewThread();
        newThread8.start();

        NewThread newThread9 = new NewThread();
        newThread9.start();
    }
}
