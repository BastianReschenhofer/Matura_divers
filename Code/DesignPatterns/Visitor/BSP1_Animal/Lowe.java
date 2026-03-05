package Code.DesignPatterns.Visitor.BSP1_Animal;

public class Lowe extends Animal {

    public Lowe(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Ich bin Löwe";
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

    
}
