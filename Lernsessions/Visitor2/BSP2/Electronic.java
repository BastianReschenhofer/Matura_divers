package BSP2;

public class Electronic implements ItemElement {
    private double price;
    private boolean isFragile; 

    public Electronic(double price, boolean isFragile) {
        this.price = price;
        this.isFragile = isFragile;
    }

    public double getPrice() {
        return price;
    }

    public boolean isFragile() {
        return isFragile;
    }

    @Override
    public <T> T accept(ItemVisitor<T> visitor) {
        return visitor.visit(this);
    }
}