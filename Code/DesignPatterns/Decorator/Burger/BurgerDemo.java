package Code.DesignPatterns.Decorator.Burger;

public class BurgerDemo {
    public static void main(String[] args){
        Burger b1 = new GlutenFreiDecorator(new BurgermitSalat());
        Burger b2 = new KaeseDecorator(new TomatenDecorator(new BurgermitSalat()));

        System.out.println(b1.getBeschreibung());
        System.out.println(b1.getPreis());
        System.out.println(b2.getBeschreibung());
        System.out.println(b2.getPreis());
    }
}
