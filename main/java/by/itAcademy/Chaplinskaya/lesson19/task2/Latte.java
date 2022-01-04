package by.itAcademy.Chaplinskaya.lesson19.task2;

public class Latte extends DrinkMaker {

    @Override
    public void chooseACup() {
        System.out.println("Бери кружку для латте");
    }

    @Override
    public void addIngredients() {
        System.out.println("Добавь кофе, молоко и не забудь про молочную пенку!");
    }
}
