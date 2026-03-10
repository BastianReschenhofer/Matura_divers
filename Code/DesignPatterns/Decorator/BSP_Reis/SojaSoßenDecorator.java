package Code.DesignPatterns.Decorator.BSP_Reis;

public class SojaSoßenDecorator extends ReisDecorator {

    final boolean dunkel;

    public SojaSoßenDecorator(Reis reis, boolean dunkel){
        super(reis);
        this.dunkel = dunkel;
    }

    @Override
    public String getBeschreibung() {
        if(dunkel)return super.reis.getBeschreibung() + "+Dunkle SojaSoße";
        return super.reis.getBeschreibung() + " +Helle SojaSoße";
    }

    @Override
    public double getPreis() {
        return super.reis.getPreis() + 0.5;
    }
    
}
