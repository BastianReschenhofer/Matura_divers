package Code.DesignPatterns.Decorator.BSP_Pizza;

public class ThunfischDecorator extends PizzaDecorator{

    public ThunfischDecorator(Pizza pizza){
        super(pizza);
    }

    public String getBeschreibung(){
        return super.pizza.getBeschreibung() + " + Thunfisch";
    }

    public double getPreis(){
        return super.pizza.getPreis() + 1;
    }
}
