package Code.DesignPatterns.Decorator.BSP_NudelDecorator;

public class StandartNudl implements Nudel{

    @Override
    public String getBeschreibung() {
        return "Nudeln";
    }

    @Override
    public double getPreis() {
        return 3;
    }

    
    
}
