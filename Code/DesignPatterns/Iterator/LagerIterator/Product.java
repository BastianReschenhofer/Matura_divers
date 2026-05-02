package Code.DesignPatterns.Iterator.LagerIterator;

public class Product {
    private String name;
    private double price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
