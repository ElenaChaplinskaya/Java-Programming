package by.itAcademy.Chaplinskaya.lesson12;

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String, Pet> pets = new HashMap<>();
        pets.put("Shelly", new Dog());
        pets.put("Basa", new Cat());
        pets.put("Zuza", new Parrot());

        printPets(pets);

        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петя", "Иванов");
        map.put("Витя", "Лешов");
        map.put("Саша", "Петров");
        map.put("Леша", "h");

        System.out.println(isUnique(map));

        Random random = new Random();
        Set<Integer> list1 = new HashSet<>(5);
        Set<Integer> list2 = new HashSet<>(5);
        for (int i = 0; i < 6; i++)
            list1.add(random.nextInt(15));
        for (int i = 0; i < 6; i++)
            list2.add(random.nextInt(15));

        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
        System.out.println();
        Iterator<Integer> itr1 = list2.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next().toString());
        }
        System.out.println();
        System.out.println(countCommon(list1, list2));

        Set<String> set = new HashSet<>(Arrays.asList("aaa", "bb", "c", "dddd", "eeeee"));

        System.out.println(removeEvenLength(set));
    }

    public static void printPets(Map<String, Pet> pets) {
        Set<Map.Entry<String, Pet>> set = pets.entrySet();
        for (Map.Entry<String, Pet> entry : set) {
            System.out.println("Key: " + entry.getKey());
        }
    }

    public static boolean isUnique(Map<String, String> map) {
        int count = 0;
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            for (Map.Entry<String, String> pair1 : copy.entrySet()) {
                if (pair.getValue().equals(pair1.getValue())) {
                    count++;
                }
            }
        }
        if (count > map.size()) {
            return false;
        }
        return true;
    }

    public static int countCommon(Set<Integer> list1, Set<Integer> list2) {
        int count = 0;
        for (Integer set1 : list1) {
            if (list2.contains(set1)) {
                count++;
            }
        }
        return count;
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        List<String> str = new ArrayList<>();
        str.addAll(set);
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() % 2 == 0) {
                str.remove(i);
            }
        }
        return new HashSet(str);
    }

}





