package by.itAcademy.Chaplinskaya.lesson12;

import com.sun.scenario.effect.SepiaTone;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class App {

    public static void main(String[] args) {

//        Map<String, Pet> pets = new HashMap<>();
//        pets.put("Shelly", new Dog());
//        pets.put("Basa", new Cat());
//        pets.put("Zuza", new Parrot());
//
//        printPets(pets);

        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петя", "Иванов");
        map.put("Витя", "Лешов");
        map.put("Саша", "Петров");
        map.put("Леша", "Иванов");

          }

//    public static void printPets(Map<String, Pet> pets) {
//        Set<Map.Entry<String, Pet>> set = pets.entrySet();
//        for (Map.Entry<String, Pet> entry : set) {
//            System.out.println("Key: " + entry.getKey());
//        }
//    }


//здесь мне нужно пройти по элементам MAP , взять все значения value и посмотреть если value уникальный-то true,
// если одинак знач 2 и более, то false
    //если цикл foreach делать, то я не понимаю как мне записать и считать одинак элементы не имея i
    // если брать обычный for, то getValue не получается.
    public boolean isUnique(Map<String, String> map){
        for (Map.Entry<String, String> entry:map.entrySet()) { //Map.Entry<String, String> entry:map.entrySet()  int i=0; i< map.size(); i++
          String value = entry.getValue();

            if(value.hashCode(i)==value.hashCode(i+1) ){
                return true;
            }
        }return false;
    }
}

