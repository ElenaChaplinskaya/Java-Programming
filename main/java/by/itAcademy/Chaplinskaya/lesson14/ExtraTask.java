package by.itAcademy.Chaplinskaya.lesson14;

import java.io.File;
import java.io.IOException;
public class ExtraTask {
    public static void main(String[] args) throws IOException {

        File catalog = new File("main/java/by/itAcademy/Chaplinskaya/lesson14/catalog");
        readFiles(catalog);

    }

    public static void readFiles(File catalog) {
        if (catalog.isDirectory()) {
            for (File file : catalog.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                } else {
                    System.out.println("Каталог: " + file.getName());
                    readFiles(file);
                }
            }
        }
    }
}
