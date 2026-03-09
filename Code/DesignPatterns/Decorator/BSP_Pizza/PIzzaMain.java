package Code.DesignPatterns.Decorator.BSP_Pizza;

public class PIzzaMain {

    public static void main(String[] args) {
        
        Pizza Salami = new SalamiDecorator(new StandartPizza());

        System.out.println(Salami.getBeschreibung());
    }
}
