package Code.DesignPatterns.Factory.BSP_Coffe;

public class Milch extends CoffeDecorator{

    public Milch(Coffe coffe){
        super.coffe = coffe;
    }

    public double price(){
        return super.coffe.price() + 0.25;
    }

    public String name(){
        return super.coffe.name() + " +Milch";
    }
}
