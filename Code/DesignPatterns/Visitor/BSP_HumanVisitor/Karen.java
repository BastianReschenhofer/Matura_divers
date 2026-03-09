package Code.DesignPatterns.Visitor.BSP_HumanVisitor;

public class Karen extends Human {

    public Karen(String name, int age, boolean gender){
        super(name, age, gender);
    }

    @Override
    public String toString() {
        return "Ich Karen";
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
    
}
