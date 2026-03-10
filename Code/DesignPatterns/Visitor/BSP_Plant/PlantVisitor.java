package Code.DesignPatterns.Visitor.BSP_Plant;

public interface PlantVisitor<T> {
    T visit(Baum baum);
    T visit (Gras gras);
    T visit (Blume blume);
}
