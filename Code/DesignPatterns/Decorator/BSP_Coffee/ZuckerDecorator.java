package Code.DesignPatterns.Decorator.BSP_Coffee;

public class ZuckerDecorator extends BeverageDecorator{

    public ZuckerDecorator(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() +1;
    }

    @Override
    public String description() {
        return super.description() + " +Zucker";
    }
}
