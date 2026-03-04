package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public abstract class DonerDecorator implements Doner{
    
    protected Doner doner;

    public abstract double getPreis();
    public abstract String getZutaten();
}   
