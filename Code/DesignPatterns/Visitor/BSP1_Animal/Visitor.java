package Code.DesignPatterns.Visitor.BSP1_Animal;

public interface Visitor<T> {

    public T visit(Kamel kamel);
    public T visit(Giraffe giraffe);
    public T visit(Lowe lowe);
    
} 
