package Code.DesignPatterns.Decorator.BSP_Reis;

public class FleischDecorator extends ReisDecorator {

    public String art;

    public FleischDecorator(Reis reis, String art){
        super(reis);
        this.art = art;
    }

    @Override
    public String getBeschreibung() {
        return super.reis.getBeschreibung() + " +" + art + " Fleisch";
    }

    @Override
    public double getPreis() {
        return super.reis.getPreis() + 2;
    }

    
    
}
