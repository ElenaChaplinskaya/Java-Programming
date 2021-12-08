package by.itAcademy.Chaplinskaya.lesson15;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


@XmlRootElement(name ="persons")
public class Persons {


    private ArrayList<Person> person;

    @XmlElement(name ="person")
    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "person=" + person +
                '}';
    }
}
