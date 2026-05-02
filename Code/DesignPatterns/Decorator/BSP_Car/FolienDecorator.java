package Code.DesignPatterns.Decorator.BSP_Car;

public class FolienDecorator extends CarDecorator{

    public FolienDecorator(Car car){
        super(car);
    }
    @Override
    public void drive() {
        car.drive();
    }

    @Override
    public String getInfo() {
        return car.getInfo() + " +Folierung";
    }
}
