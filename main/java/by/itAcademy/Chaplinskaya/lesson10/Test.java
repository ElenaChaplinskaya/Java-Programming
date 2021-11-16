package by.itAcademy.Chaplinskaya.lesson10;

import java.util.Arrays;

public class Test<T> {

    public T[] filter(T[] array, Filter filter) {
        int l = 0;
        for (int i = 0; i < array.length; i++) {
            if (filter.apply(array[i])) {
                array[i - l] = array[i];
            } else {
                l++;
            }
        }
        return Arrays.copyOf(array, array.length - l);
    }
}

