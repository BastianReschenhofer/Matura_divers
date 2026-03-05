package Code.DesignPatterns.Factory.BSP_Coffe;

public class Zucker extends CoffeDecorator {

    public Zucker(Coffe coffe){
        super.coffe = coffe;
    }

    public double price(){
        return super.coffe.price() + 0.1;
    }

    public String name(){
        return super.coffe.name() + " +Zucker";
    }
    
}
