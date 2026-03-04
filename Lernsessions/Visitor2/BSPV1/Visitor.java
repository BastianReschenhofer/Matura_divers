package BSPV1;

public interface Visitor<T> {
    public T visit(Literal literal);
    public T visit(BinaryOperation binaryOperation);
}
