package Code.DesignPatterns.Visitor.BSP1_Animal;

public class Kamel extends Animal {

    public Kamel(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Ich bin ein Kamel";
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

}
