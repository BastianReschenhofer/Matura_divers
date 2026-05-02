package Code.DesignPatterns.Decorator.BSP_Car;

public class BMW implements Car{
    public String modell;
    public BMW(String modell){
        this.modell = modell;
    }
    @Override
    public void drive() {
        System.out.println("BMW fährt");
    }

    @Override
    public String getInfo() {
        return "BMW des Modells " + modell ;
    }
}
