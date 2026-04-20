package Code.DesignPatterns.Factory.BSP_VehikelFactory;

public class Auto implements Vehicle {

    public Auto() {
    }

    @Override
    public void drive() {
        System.out.println("Das Auto fährt.");
    }

    @Override
    public void info() {
        System.out.println("Das ist ein Auto.");
    }
    
}
