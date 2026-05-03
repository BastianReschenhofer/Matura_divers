package Code.DesignPatterns.Decorator.Burger;

public class KaeseDecorator extends BurgerDecorator {

    public KaeseDecorator(Burger burger){
        super(burger);
    }

    public double getPreis(){
        return burger.getPreis() + 1;
    }

    public String getBeschreibung(){
        return burger.getBeschreibung() + " +Käse";
    }
}
