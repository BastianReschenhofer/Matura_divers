package Code.DesignPatterns.Decorator.Burger;

public class TomatenDecorator extends BurgerDecorator{

    public TomatenDecorator(Burger burger) {
        super(burger);
    }

    public double getPreis(){
        return burger.getPreis() + 0.5;
    }

    public String getBeschreibung(){
        return burger.getBeschreibung() + " +Tomate";
    }
}
