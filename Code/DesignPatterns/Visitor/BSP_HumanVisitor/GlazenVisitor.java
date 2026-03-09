package Code.DesignPatterns.Visitor.BSP_HumanVisitor;



public class GlazenVisitor implements Visitor<Boolean> {

    @Override
    public Boolean visit(Karen karen) {
       return false;
    }

    @Override
    public Boolean visit(Woman woman) {
        return false;
    }

    @Override
    public Boolean visit(Man man) {
        if(man.glatze) return true;
        return false;
    }
    
}
