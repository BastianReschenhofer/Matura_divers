package Code.DesignPatterns.Decorator.BSP_Coffee;

public class MilchDecorator extends BeverageDecorator {
    public MilchDecorator(Beverage beverage){
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String description() {
        return super.description() + " +Milch";
    }
}
