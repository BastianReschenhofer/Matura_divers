package Code.DesignPatterns.Decorator.BSP_Car;

public class Audi implements Car{
    String modell;
    public Audi(String modell){
        this.modell = modell;
    }

    @Override
    public void drive() {
        System.out.println("Audi fährt");
    }

    @Override
    public String getInfo() {
        return "Audi des Modells " + modell ;
    }
}
