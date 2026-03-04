package BSP3;

public class Rindviech extends Animal {

    private boolean flecken;

    public Rindviech(String name, boolean flecken){
        super(name);
        this.flecken = flecken;
    }


    public <T> T accept(Visitor<T> v){
        return v.visit(this);
    }
}
