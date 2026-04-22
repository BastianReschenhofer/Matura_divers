package Code.Refelctions.BSP_PizzaFactory;

public class PizzaBort implements Pizza{
    public PizzaBort(){};
    @Override
    public void eat() {
        System.out.println("PizzaBrot gegessen!");
    }

    @Override
    public String info() {
        return "Pizza Brot";
    }
}
