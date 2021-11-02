package by.itAcademy.Chaplinskaya.lesson6;


public class Children {
    private String name;
    private String secondName;
    private int age;

    public Children() {
        name = "Tony";
        secondName = "Mony";
        age = 15;
    }

    public Children(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + " " + secondName + " " + age);
    }
}


