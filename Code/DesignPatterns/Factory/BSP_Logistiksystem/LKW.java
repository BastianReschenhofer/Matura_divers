package Code.DesignPatterns.Factory.BSP_Logistiksystem;

public class LKW implements Transport {

    @Override
    public String deliver() {
        return "Mit dem LKW geliefer";
    }
    
}
