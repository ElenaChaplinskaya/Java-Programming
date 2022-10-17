package by.itAcademy.Chaplinskaya.lesson10;

public abstract class Clothing {
    private int size;
    private double price;
    private String color;

       Clothing(int s, double p, String c){
        this.size= s;
        this.price=p;
        this.color=c;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
