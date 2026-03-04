package BSP1;

public interface Expr<V> {
    
    <T> T accept(Visitor<T> visitor);
    
    V evaluate();
}   