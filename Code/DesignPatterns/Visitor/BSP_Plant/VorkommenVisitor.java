package Code.DesignPatterns.Visitor.BSP_Plant;

public class VorkommenVisitor implements PlantVisitor<String> {

    @Override
    public String visit(Baum baum) {
        return baum.getVorkommen();
    }

    @Override
    public String visit(Gras gras) {
        return gras.getVorkommen();
    }

    @Override
    public String visit(Blume blume) {
        return blume.getVorkommen();
    }
    
}
