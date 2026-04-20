package Code.DesignPatterns.Factory.BSP_VehikelFactory;

public class EScooter implements Vehicle {
    public EScooter() {
    }

    @Override
    public void drive() {
        System.out.println("Der E-Scooter fährt.");
    }

    @Override
    public void info() {
        System.out.println("Das ist ein E-Scooter.");
    }
}
