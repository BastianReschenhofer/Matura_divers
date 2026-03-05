package Code.DesignPatterns.Factory.BSP_Coffe;

public class Milchschaum extends CoffeDecorator {

    public Milchschaum(Coffe coffe){
        super.coffe = coffe;
    }

    public double price(){
        return super.coffe.price() + 0.5;
    }

    public String name(){
        return super.coffe.name() + " +Milchschaum";
    }

}
