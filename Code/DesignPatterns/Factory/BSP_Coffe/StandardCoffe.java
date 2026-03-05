package Code.DesignPatterns.Factory.BSP_Coffe;

public class StandardCoffe implements Coffe {

    @Override
    public double price() {
        return 2.5; 
    }

    @Override
    public String name() {
        return "Verlängerter";
    }
    
}
