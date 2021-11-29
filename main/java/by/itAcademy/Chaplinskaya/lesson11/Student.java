package by.itAcademy.Chaplinskaya.lesson11;

import java.util.List;

public class Student {

    String name;
    int course;
    List<Integer> grades;

    public Student(String name, int course, List<Integer> grades) {
        this.name = name;
        this.course = course;
        this.grades = grades;

    }

    public double getAverage() {
        List<Integer> list = getGrades();
        double num = 0.0;
        for (Integer integer : list) {
            num += integer;
        }
        return (num / list.size());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                ", average=" +
                '}';
    }
}
