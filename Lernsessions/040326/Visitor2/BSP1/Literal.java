package BSP1;

public class Literal implements Expr<Integer> {
    
    private final int value;
    
    public Literal(int value) {
        this.value = value;
    }
    
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
    
    @Override
    public Integer evaluate() {
        return value;
    }
    
}
