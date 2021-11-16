package by.itAcademy.Chaplinskaya.lesson10;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        String array[] = new String[]{"fff", "ddd", null, "aa"};
        Integer ints[] = new Integer[]{5, 2, 4, 0, 3};

        Test<String> test = new Test<>();
        Test<Integer> test1 = new Test<>();


        String[] newArray = test.filter(array, new Filter<String>() {
            @Override
            public boolean apply(String str) {
                if (str != null && str.length() > 2) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        System.out.println(Arrays.toString(newArray));

        Integer[] newInts = test1.filter(ints, new Filter<Integer>() {
            @Override
            public boolean apply(Integer nums) {
                if (nums != 0 && nums > 2) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        System.out.println(Arrays.toString(newInts));


        String sizes1 = Sizes.XS.getDescription(34);
        System.out.println(sizes1);
        String sizes2 = Sizes.XXS.getDescription(32);
        System.out.println(sizes2);

        Clothing tshirt = new Tshirt(34, 55.50, "Черный");
        Clothing pants = new Pants(42,100.50,"Белый");
        Clothing skirt = new Skirt(38, 78.50, "Желтый");
        Clothing tie = new Tie(40, 12.50, "Синий");
        Object clothing[] = new Object[]{tshirt,pants,skirt,tie};

        Studio studio = new Studio();
        studio.dressAMan(clothing);
        System.out.println();
        studio.dressAWoman(clothing);



    }
}


