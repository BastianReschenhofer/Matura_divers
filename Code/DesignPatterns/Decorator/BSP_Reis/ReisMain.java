package Code.DesignPatterns.Decorator.BSP_Reis;

public class ReisMain {
    public static void main(String[] args) {
        
        Reis reis = new GemuseDecorator(new FleischDecorator(new SojaSoßenDecorator(new StandartReis(), true), "Huhn"));

        System.out.println(reis.getBeschreibung());
        System.out.println("Preis:" + reis.getPreis());
    }
}
