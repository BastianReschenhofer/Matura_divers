package Code.DesignPatterns.Decorator.BSP_Pizza;

public abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }


}
