package Code.DesignPatterns.Factory.ShapeFactory;

public class NoMatchingShape extends RuntimeException {
    public NoMatchingShape(String message) {
        super(message);
    }
}
