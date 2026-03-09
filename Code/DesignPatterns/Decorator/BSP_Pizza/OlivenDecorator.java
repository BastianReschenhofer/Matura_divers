package Code.DesignPatterns.Decorator.BSP_Pizza;

public class OlivenDecorator extends PizzaDecorator{

    public OlivenDecorator(Pizza pizza){
        super(pizza);
    }

    public String getBeschreibung(){
        return super.pizza.getBeschreibung() +" + Oliven";
    }

    public double getPreis(){
        return super.pizza.getPreis() + 0.2;
    }
}
