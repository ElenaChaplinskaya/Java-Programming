package by.itAcademy.Chaplinskaya.lesson19.task2;

public class Cafe {
    public static void main(String[] args) {
        DrinkMaker drinkMaker = new Latte();
        DrinkMaker drinkMaker1 = new Tea();
        drinkMaker.makeDrink();
        System.out.println();
        drinkMaker1.makeDrink();
    }
}
