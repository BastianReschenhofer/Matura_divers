package Code.DesignPatterns.Decorator.BSP_NudelDecorator;

public class TomatenDecorator extends NudelDecorator{

    public TomatenDecorator(Nudel nudel){
        super(nudel);
    }

    @Override
    public String getBeschreibung() {
        return super.nudel.getBeschreibung() +" + Tomaten";
    }

    @Override
    public double getPreis() {
       return super.nudel.getPreis() + 1;
    }

    
    
}
