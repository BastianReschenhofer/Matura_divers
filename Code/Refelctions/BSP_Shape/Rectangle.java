package Code.Refelctions.BSP_Shape;

public class Rectangle implements Shape{
    public final int h;
    public final int w;

    public Rectangle(){
        this.h = 0;
        this.w = 0;
    }
    public Rectangle(int h, int w){
        this.h = h;
        this.w = w;
    }

    public void draw(){
        System.out.println("Rechteck " + w + " breit, " + h + " hoch");
    }
}
