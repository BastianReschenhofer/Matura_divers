package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public class Schafkase extends DonerDecorator{

    public Schafkase(Doner doner){
        super.doner = doner;
    }
    @Override
    public double getPreis() {
        return super.doner.getPreis() + 0.5;
    }

    @Override
    public String getZutaten() {
        return super.doner.getZutaten() + ", Schafkäse";
    }
    
}
