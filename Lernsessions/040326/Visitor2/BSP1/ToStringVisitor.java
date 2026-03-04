package BSP1;


public class ToStringVisitor implements Visitor<String> {
    
    @Override
    public String visit(Literal literal) {
        return Integer.toString(literal.evaluate());
    }
    
    @Override
    public String visit(BinaryOperation binaryOperation) {
        String leftStr = binaryOperation.getLeft().accept(this);
        String rightStr = binaryOperation.getRight().accept(this);
        
        // Assuming the operator is either +, -, *, or /
    
        
        return "(" + leftStr + " " + binaryOperation.getOperatorSymbol() + " " + rightStr + ")";
    }

}