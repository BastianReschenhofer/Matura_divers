package BSP3;

public class Sau extends Animal {
    
    private boolean ringelschwanz;

    public Sau(String name, boolean ringelschwanz){
        super(name);
        this.ringelschwanz = ringelschwanz;
    }

    public <T> T accept(Visitor<T> v){
        return v.visit(this);
    }
}
