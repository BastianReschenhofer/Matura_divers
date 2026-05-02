package Code.DesignPatterns.Decorator.BSP_Car;

public class CarDecoratorDemo {

    public static void main(String[] args){
        Car BMW = new FolienDecorator(new AluFelgenDecorator(new BMW("M4")));

        System.out.println(BMW.getInfo());

    }
}
