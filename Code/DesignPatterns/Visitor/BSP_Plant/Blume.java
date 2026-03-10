package Code.DesignPatterns.Visitor.BSP_Plant;

public class Blume extends Plant {

    public Blume(String vorkommen){
        super(vorkommen);
    }

    @Override
    public <T> T accept(PlantVisitor<T> v){
        return v.visit(this);
    }

    @Override
    public String getBeschreibung() {
        return "Blume ";
    }
   
}
