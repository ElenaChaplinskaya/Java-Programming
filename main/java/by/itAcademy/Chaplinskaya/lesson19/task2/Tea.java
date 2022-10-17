package by.itAcademy.Chaplinskaya.lesson19.task2;

public class Tea extends DrinkMaker {
    @Override
    public void chooseACup() {
        System.out.println("Бери кружку для чая");
    }

    @Override
    public void addIngredients() {
        System.out.println("Засыпь чай");
    }
}
