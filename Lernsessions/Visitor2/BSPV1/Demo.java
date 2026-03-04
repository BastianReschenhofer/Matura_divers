package BSPV1;

public class Demo {
    
    public static void main(String[] args) {
        // Create some expressions
        Expr<Integer> expr1 = new Literal(5);
        Expr<Integer> expr2 = new Literal(10);
        Expr<Integer> sum = new BinaryOperation(expr1, expr2, (a, b) -> a + b, "+");
        
        // Evaluate the expression
        int result = sum.evaluate();
        System.out.println("Result: " + result); // Output: Result: 15

        // Create a ToStringVisitor
        ToStringVisitor toStringVisitor = new ToStringVisitor();
        String expressionString = sum.accept(toStringVisitor);
        System.out.println("Expression: " + expressionString);
    }
}
