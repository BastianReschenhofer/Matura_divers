package Code.DesignPatterns.Factory.BSP_Logistiksystem;

public class LogisticsFactory {

    public Transport transport(String transport){
        if(transport == null) return null;

        if(transport.equalsIgnoreCase("LKW")) return new LKW();
        if(transport.equalsIgnoreCase("Ship")) return new Ship();

        System.out.println("Kein Transporttyp gefunden");
        return null;
    }
    
}
