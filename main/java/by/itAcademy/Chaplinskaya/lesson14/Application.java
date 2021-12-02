package by.itAcademy.Chaplinskaya.lesson14;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {

        File file = new File("main/java/by/itAcademy/Chaplinskaya/lesson14/text");
        File file1 = new File("main/java/by/itAcademy/Chaplinskaya/lesson14/text2.txt");
        file1.createNewFile();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1, true))) {
            String t;
            while ((t = bufferedReader.readLine()) != null) {
                bufferedWriter.write(t);
                bufferedWriter.newLine();
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
