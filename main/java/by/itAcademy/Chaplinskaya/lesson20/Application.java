package by.itAcademy.Chaplinskaya.lesson20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Application {

    public static void main(String[] args) {

        Class<?> testMethodsClass = TestMethods.class;

        Method[] methods = testMethodsClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                System.out.print(method.getName() + " метод с аннотацией ");
                AcademyInfo info = method.getAnnotation(AcademyInfo.class);
                try {
                    method.invoke(testMethodsClass, info.year());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(method.getName() + " метод без аннотации");
            }
        }
    }
}

