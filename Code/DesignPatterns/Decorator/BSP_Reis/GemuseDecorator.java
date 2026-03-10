package Code.DesignPatterns.Decorator.BSP_Reis;

public class GemuseDecorator extends ReisDecorator{
    
    public GemuseDecorator(Reis reis){
        super(reis);
    }

    @Override
    public String getBeschreibung() {
        return super.reis.getBeschreibung() +" +Gemüse";
    }

    @Override
    public double getPreis() {
        return super.reis.getPreis() + 1.5;
    }

    
}
