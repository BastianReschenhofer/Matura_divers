package Code.DesignPatterns.Decorator.BSP_Coffee;

public class Coffee implements Beverage{

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public String description() {
        return "Kaffe";
    }
}
