package Code.DesignPatterns.Visitor.BSP_HumanVisitor;

public interface Visitor<T> {
    public T visit(Karen karen);
    public T visit(Woman woman);
    public T visit(Man man);
}
