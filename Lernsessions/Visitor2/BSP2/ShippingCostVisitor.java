package BSP2;

public class ShippingCostVisitor implements ItemVisitor<Double> {

    @Override
    public Double visit(Book book) {
        return 0.0;
    }

    @Override
    public Double visit(Electronic electronic) {
        double cost = 5;
        if(electronic.isFragile()) cost += 4;
        return cost;
    }

    @Override
    public Double visit(Furniture furniture) {
        return furniture.getWeight() * 2.5;
    }
    
}
