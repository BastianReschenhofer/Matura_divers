package Code.DesignPatterns.Decorator.Burger;

public class GlutenFreiDecorator extends BurgerDecorator{
    public GlutenFreiDecorator(Burger burger){
        super(burger);
    }

    public double getPreis(){
        return burger.getPreis() + 10;
    }

    public String getBeschreibung(){
        return burger.getBeschreibung() + " +Glutenfrei";
    }
}
