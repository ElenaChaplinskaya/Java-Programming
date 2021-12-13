package by.itAcademy.Chaplinskaya.lesson16;

public class Book  {

    private int imprintDate;
    private String name;
    private String author;

    public Book(int imprintDate, String name, String author) {
        this.imprintDate = imprintDate;
        this.name = name;
        this.author = author;
    }

    public int getImprintDate() {
        return imprintDate;
    }

    public void setImprintDate(int imprintDate) {
        this.imprintDate = imprintDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "imprintDate=" + imprintDate +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o != null && o instanceof Book) {
//            return this.imprintDate = ((Book) o).imprintDate;
//        }
//        return 1;
    }

