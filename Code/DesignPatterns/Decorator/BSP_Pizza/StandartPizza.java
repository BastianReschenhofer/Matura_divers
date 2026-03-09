package Code.DesignPatterns.Decorator.BSP_Pizza;

public class StandartPizza implements Pizza{

    @Override
    public String getBeschreibung() {
        return "Pizzabrot";
    }

    @Override
    public double getPreis() {
        return 5;
    }

}
