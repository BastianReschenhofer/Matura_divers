package Code.DesignPatterns.Decorator.BSP_NudelDecorator;

public class NudelMain  {
    public static void main(String[] args) {
        
        Nudel nudel = new TomatenDecorator(new ParmesanDecorator(new StandartNudl()));

        System.out.println(nudel.getBeschreibung());
        System.out.println(nudel.getPreis());
    }
}
