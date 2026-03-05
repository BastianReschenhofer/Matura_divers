package Code.DesignPatterns.Factory.BSP_Coffe;

public class main {
    public static void main(String[] args) {
        
        CoffeFactory barista1 = new CoffeFactory();

        Coffe cappu = barista1.makeCoffe("Cappu");
        System.out.println(cappu.name() + ", Preis:" + cappu.price());

        Coffe verlängertZucker = new Zucker(barista1.makeCoffe("Verlängerter"));
        System.out.println(verlängertZucker.name() + ", Preis:" + verlängertZucker.price());
        
    }
}
