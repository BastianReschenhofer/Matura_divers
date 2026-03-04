package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public class StandartDoner implements Doner {

    @Override
    public double getPreis() {
        return 5;
    }

    @Override
    public String getZutaten() {
        return "Fladenbrot mit Fleisch und Salat";
    }
    
}
