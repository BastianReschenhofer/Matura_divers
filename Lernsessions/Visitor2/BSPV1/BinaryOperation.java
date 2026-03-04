package BSPV1;

import java.util.function.BinaryOperator;

public class BinaryOperation implements Expr<Integer> {
    
    private final Expr<Integer> left;
    private final Expr<Integer> right;
    private final BinaryOperator<Integer> operator;
    private final String operatorSymbol;
    
    public BinaryOperation(Expr<Integer> left, Expr<Integer> right, BinaryOperator<Integer> operator, String operatorSymbol) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.operatorSymbol = operatorSymbol;
    }
    
    public String getOperatorSymbol() {
        return operatorSymbol;
    }

    public Expr<Integer> getLeft() {
        return left;
    }

    public Expr<Integer> getRight() {
        return right;
    }
    
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
    
    @Override
    public Integer evaluate() {
        int leftValue = left.evaluate();
        int rightValue = right.evaluate();
        
        return operator.apply(leftValue, rightValue);
    }


    public BinaryOperator<Integer> getOperator() {
        return operator;
    }
    
}
