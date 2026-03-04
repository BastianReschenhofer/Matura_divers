package Code.DesignPatterns.Factory.BSP_Logistiksystem;

public class main {
    public static void main(String[] args) {
        
        LogisticsFactory factory = new LogisticsFactory();

        Transport a = factory.transport("LKW");
        if(a!=null) System.out.println(a.deliver());

        Transport b = factory.transport("Ship");
        if(b!=null) System.out.println(b.deliver());
    }
}
