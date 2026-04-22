package Code.DesignPatterns.Decorator.BSP_Coffee;

public abstract class BeverageDecorator implements Beverage{
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage= beverage;
    }

    public double cost() {
        return beverage.cost();
    }

    public String description() {
        return beverage.description();
    }
}
