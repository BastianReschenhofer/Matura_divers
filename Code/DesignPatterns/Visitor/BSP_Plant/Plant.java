package Code.DesignPatterns.Visitor.BSP_Plant;

public abstract class Plant {
    public abstract<T> T accept(PlantVisitor<T> v);

    public abstract String getBeschreibung();

    public String getVorkommen(){
        return this.vorkommen;
    }

    private String vorkommen;

    public Plant(String vorkommen){
        this.vorkommen = vorkommen;
    }
}
