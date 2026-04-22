package Code.DesignPatterns.Decorator.BSP_Coffee;

public class Tea implements Beverage{

    @Override
    public double cost() {
        return 1;
    }

    @Override
    public String description() {
        return "Tea";
    }
}
