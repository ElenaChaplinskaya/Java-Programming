package by.itAcademy.Chaplinskaya.lesson9;

public class Application {
    public static void main(String[] args) {


        Administration adm1 = new Administration("Иванов Иван Иванович","Бухгалтер", "почасовая", 15.50, 168);
        System.out.println("Бухгалтер Иванов И.И.:"+adm1.getSalaryPerson());

        Administration adm2 = new Director("Попов Павел Петрович","Директор", "почасовая", 25.00, 168, 20);
        System.out.println("Директор Попов П.П.:"+adm2.getSalaryPerson());

        Administration adm3 = new Manager("Абрамов Абраам Мойшович","Менеджер по продажам", "почасовая", 9.80,168,40);
        System.out.println("Менеджер по продажам Абрамов А.М.:"+adm3.getSalaryPerson());

        Workers work1 = new Workers("Васильев Василий Васильевич","Слесарь", "сдельная", 500,3.50);
        System.out.println("Слесарь Васильев В.В.:" + work1.getSalaryPerson());

        Workers work2 = new ExternalWorker("Петров Петр Петрович","Токарь", "сдельная", 550, 3.50);
        System.out.println("Токарь Петров Петр Петрович:" + work2.getSalaryPerson());
    }
    }
