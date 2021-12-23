package by.itAcademy.Chaplinskaya.lesson19.task2;

public abstract class DrinkMaker {

    public void makeDrink() {
        chooseACup();
        addIngredients();
        System.out.println("Теперь добавь воды!");
    }

    public abstract void chooseACup();

    public abstract void addIngredients();

}
