package Code.DesignPatterns.Decorator.BSP_Pizza;

public class SalamiDecorator extends PizzaDecorator {

    public SalamiDecorator(Pizza pizza){
        super(pizza);
    }
    
    public String getBeschreibung(){
        return super.pizza.getBeschreibung() + " + Salami";
    }

    public double getPreis(){
        return super.pizza.getPreis() + 1;
    }

}
