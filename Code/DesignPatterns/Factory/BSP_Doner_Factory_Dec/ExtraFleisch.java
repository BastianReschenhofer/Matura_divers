package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public class ExtraFleisch extends DonerDecorator {

    public ExtraFleisch(Doner doner){
        super.doner = doner;
    }

    @Override
    public double getPreis() {
        return super.doner.getPreis() + 1.5;
    }

    @Override
    public String getZutaten() {
        return super.doner.getZutaten() + ", extra Fleisch";
    }
    
}
