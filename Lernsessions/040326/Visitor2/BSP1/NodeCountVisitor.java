package BSP1;

public class NodeCountVisitor implements Visitor<Integer> {

    @Override
    public Integer visit(Literal literal) {
        return 1;
        
    }

    @Override
    public Integer visit(BinaryOperation binaryOperation) {
        return 1 + binaryOperation.getRight().accept(this) + binaryOperation.getLeft().accept(this);
        
    }
    
   
    
}
