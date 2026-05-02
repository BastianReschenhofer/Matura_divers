package Code.DesignPatterns.Factory.ShapeFactory;

public class Kreis implements Shape{
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public String getInfo() {
        return "Kreis mit radius " + radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
