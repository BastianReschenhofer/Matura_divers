package BSP2;

public class BlackFridayVisitor implements ItemVisitor<Double>{

    @Override
    public Double visit(Book book) {
        return book.getPrice();
    }

    @Override
    public Double visit(Electronic electronic) {
        double price = electronic.getPrice();
        if(electronic.isFragile()) return price = price * 0.9;
        return price * 0.8;
    }

    @Override
    public Double visit(Furniture furniture) {
        double price = furniture.getPrice() - 50;
        if(price < 0) return 0.0;
        return price;
    }
    
}


