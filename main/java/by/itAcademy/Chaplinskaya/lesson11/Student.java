package by.itAcademy.Chaplinskaya.lesson11;

import java.util.List;

public class Student {

    String name;
    int course;
    List<Integer> grades;
    double average;


    public Student(String name, int course, List<Integer> grades) {
        this.name = name;
        this.course = course;
        this.grades = grades;
        List<Integer> list = getGrades();


    public static double average(List <Integer> list){
            double num = 0.0;
            for (Integer integer : list) {
                num += integer;
            }
            setAverage(num / list.size());
        }
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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                ", average=" + average +
                '}';
    }
}
