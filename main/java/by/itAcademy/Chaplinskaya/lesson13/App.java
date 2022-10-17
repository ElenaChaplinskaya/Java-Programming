package by.itAcademy.Chaplinskaya.lesson13;

import java.util.HashMap;
import java.util.Map;

import static by.itAcademy.Chaplinskaya.lesson13.LogIn.logIn;
public class App {
    public static void main(String[] args) {


        Map<String, String> users = new HashMap<>();
        users.put("login0", "1234567q");
        users.put("login1", "1234");
        users.put("login2", "12345");
        users.put("login3", "1234567aaa");

        try {
           if(logIn("login", "1234567q", users)){
               System.out.println("Authorized user");
           }else{
               System.out.println("Invalid login");
           }
        } catch (PassException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }
}
