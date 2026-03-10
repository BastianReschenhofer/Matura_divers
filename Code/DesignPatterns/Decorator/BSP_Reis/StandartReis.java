package Code.DesignPatterns.Decorator.BSP_Reis;

public class StandartReis implements Reis{

    @Override
    public String getBeschreibung() {
        return "Reis ";
    }

    @Override
    public double getPreis() {
        return 2.5;
    }
    
}
