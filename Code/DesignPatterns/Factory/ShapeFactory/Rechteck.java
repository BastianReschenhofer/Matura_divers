package Code.DesignPatterns.Factory.ShapeFactory;

public class Rechteck implements Shape{
    private double breite;
    private double hoehe;

    public Rechteck(double breite, double hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public String getInfo() {
        return "Rechteck " + breite + " x " + hoehe;
    }

    public double area() {
        return breite * hoehe;
    }
}
