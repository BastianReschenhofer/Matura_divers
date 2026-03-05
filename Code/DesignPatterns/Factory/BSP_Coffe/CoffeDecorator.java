package Code.DesignPatterns.Factory.BSP_Coffe;

public abstract class CoffeDecorator implements Coffe{
    
    protected Coffe coffe;

    public abstract double price();
    public abstract String name();
    
}
