package BSP2;

public class Furniture implements ItemElement {
    private double price;
    private double weight; // Gewicht in Kilogramm

    public Furniture(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}