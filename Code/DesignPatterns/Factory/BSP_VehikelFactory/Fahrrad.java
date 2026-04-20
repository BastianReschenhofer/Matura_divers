package Code.DesignPatterns.Factory.BSP_VehikelFactory;

public class Fahrrad implements Vehicle{
    public Fahrrad() {
    }

    @Override
    public void drive() {
        System.out.println("Das Fahrad fährt.");
    }

    @Override
    public void info() {
        System.out.println("Das ist ein Fahrrad.");
    }
}
