package Code.DesignPatterns.Decorator.BSP_Car;

public abstract class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }
}
