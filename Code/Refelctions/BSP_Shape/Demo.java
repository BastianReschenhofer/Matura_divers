package Code.Refelctions.BSP_Shape;

public class Demo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.create("Circle");
        Shape circle1 = ShapeFactory.create("Circle", 10);


        circle.draw();
        circle1.draw();


        // Dynamisch!
        String[] types = {"Circle", "Circle"};
        for (String t : types) {
            ShapeFactory.create(t).draw();
        }
    }
}
