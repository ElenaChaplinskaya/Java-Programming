package by.itAcademy.Chaplinskaya.lesson16;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class App {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.startsWith("J") || s.startsWith("N");
        Predicate<String> predicate1 = s -> s.endsWith("A");

        System.out.println(predicate.and(predicate1).test("Java is cool"));


        Book book1 = new Book(1985, "CCCP", "Черненко К.У.");
        Book book2 = new Book(1991, "Как развалить СССР", "Горбачев М.С.");
        Book book3 = new Book(1993, "Дорога в светлое будущее", "Шушкевич С.С.");
        Book book4 = new Book(1996, "Как стать президентом", "Лукашенко А.Г.");
        Book book5 = new Book(2015, "Как построить СССР", "Лукашенко А.Г.");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Comparator<Book> comparator = Comparator.comparing(Book::getImprintDate);

        books.stream()
                .sorted(comparator)
                .forEach(System.out::println);


        List<String> names = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав", "Никита", "Артем", "Иван",
                "Кирилл"));
        List<String> surnames = new ArrayList<>(Arrays.asList("Николаев", "Владимиров", "Александров", "Иванов",
                "Васильев", "Сергеев", "Викторов"));
        List<Integer> ages = new ArrayList<>(Arrays.asList(15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30));

        List<Person> personList = createPerson(names, surnames, ages, 50);
        Comparator<Person> comparator1 = Comparator.comparing(Person::getSurname).thenComparing(Person::getName);

        List<String> list = personList.stream().filter(p -> p.getAge() < 21)
                .peek((p) -> System.out.println(personList))
                .sorted(comparator1)
                .limit(4)
                .map(s -> s.getSurname())
                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);

    }

    public static List<Person> createPerson(List<String> names, List<String> surnames, List<Integer> ages, int count) {
        Random random = new Random();
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String name = names.get(random.nextInt(names.size()));
            String surname = surnames.get(random.nextInt(surnames.size()));
            int age = ages.get(random.nextInt(ages.size()));
            people.add(new Person(name, surname, age));
        }
        return people;
    }

}
