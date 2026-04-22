package Code.Refelctions.BSP_PizzaFactory;

public class PizzaThunfisch implements Pizza{
    public PizzaThunfisch(){};
    @Override
    public void eat() {
        System.out.println("PizzaThunfisch gegessen!");
    }

    @Override
    public String info() {
        return "Pizza mit Thunfisch";
    }
}
