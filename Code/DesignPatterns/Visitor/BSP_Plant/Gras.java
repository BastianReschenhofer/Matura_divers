package Code.DesignPatterns.Visitor.BSP_Plant;

public class Gras extends Plant{

    public Gras(String vorkommen){
        super(vorkommen);
    }

    @Override
    public <T> T accept(PlantVisitor<T> v){
        return v.visit(this);
    }

    @Override
    public String getBeschreibung(){
        return "Gras ";
    }
    
    
}
