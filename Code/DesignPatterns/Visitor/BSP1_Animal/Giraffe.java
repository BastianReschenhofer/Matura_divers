package Code.DesignPatterns.Visitor.BSP1_Animal;

public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Ich bin eine Giraffe";
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

}
