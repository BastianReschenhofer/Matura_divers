package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public class Scharf extends DonerDecorator{

    public Scharf(Doner doner){
        super.doner = doner;
    }

    @Override
    public double getPreis() {
        return super.doner.getPreis();
    }

    @Override
    public String getZutaten() {
        return super.doner.getZutaten() + ", Scharf";
    }
    
}
