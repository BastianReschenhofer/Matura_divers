package Code.DesignPatterns.Decorator.Burger;

public class BurgermitSalat implements Burger{

    @Override
    public double getPreis() {
        return 5;
    }

    @Override
    public String getBeschreibung() {
        return "Burger mit Salat";
    }
}
