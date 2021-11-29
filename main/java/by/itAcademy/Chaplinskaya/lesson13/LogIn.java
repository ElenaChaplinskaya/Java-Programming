package by.itAcademy.Chaplinskaya.lesson13;

import java.util.Map;

public class LogIn {

    public static boolean logIn(String login, String pass, Map<String, String> users) throws PassException {
        for (Map.Entry<String, String> pair : users.entrySet()) {
            if (pair.getKey() == login) {
                if (pair.getValue() == pass) {
                    return true;
                } else {
                    if (pair.getValue().matches("(?=.*[0-9])(?=.*[a-z]).{8,20}")) {
                        throw new PassException("Invalid pass");
                    } else {
                        throw new PassException("Пароль должен содержать хотя бы одну цифру и" +
                                " буквы латинского алфавита, длина пароля от 8 до 20 символов");
                    }
                }
            }
        }
        return false;
    }
}


