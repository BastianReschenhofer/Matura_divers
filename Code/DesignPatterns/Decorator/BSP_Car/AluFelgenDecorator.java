package Code.DesignPatterns.Decorator.BSP_Car;

public class AluFelgenDecorator extends CarDecorator{

    public AluFelgenDecorator(Car car){
        super(car);
    }

    @Override
    public void drive() {
        car.drive();
    }

    @Override
    public String getInfo() {
        return car.getInfo() + " +AluFelgen ";
    }
}
