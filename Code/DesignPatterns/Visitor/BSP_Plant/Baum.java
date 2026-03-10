package Code.DesignPatterns.Visitor.BSP_Plant;

public class Baum extends Plant {

    public Baum(String vorkommen){
        super(vorkommen);
    }

    @Override
    public String getBeschreibung() {
        return "Baum";
    }

    @Override
    public <T> T accept(PlantVisitor<T> v) {
        return v.visit(this);
    }
    
}
