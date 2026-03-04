package BSP2;

public interface ItemVisitor<T> {
    T visit(Book book);
    T visit(Electronic electronic);
    T visit(Furniture furniture);
}
