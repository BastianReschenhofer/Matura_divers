package Code.Refelctions.BSP_Shape;

public class Circle implements Shape{
    private final int radius;
    public Circle(){
        this.radius = 0;
    }
    public Circle(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Kreis mit "+ radius + " Radius");
    }
}
