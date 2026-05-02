package Code.DesignPatterns.Factory.ShapeFactory;

public class Dreieck implements Shape{
    private double seite1;
    private double seite2;
    private double seite3;

    public Dreieck(double seite1, double seite2, double seite3) {
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    public String getInfo() {
        return "Dreieck " + seite1 + ", " + seite2 + ", " + seite3;
    }

    public double area() {
        double s = (seite1 + seite2 + seite3) / 2;
        return Math.sqrt(s * (s - seite1) * (s - seite2) * (s - seite3));
    }
}
