package Code.DesignPatterns.Decorator.BSP_NudelDecorator;

public class ParmesanDecorator extends NudelDecorator{

    public ParmesanDecorator(Nudel nudel){
        super(nudel);
    }

    @Override
    public String getBeschreibung() {
        return super.nudel.getBeschreibung() + " + Parmesan";
    }

    @Override
    public double getPreis() {
        return super.nudel.getPreis() + 0.5;
    }

    
    
}
