package BSP2;

public class Book implements ItemElement {
    private double price;
    private String title;

    public Book(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
