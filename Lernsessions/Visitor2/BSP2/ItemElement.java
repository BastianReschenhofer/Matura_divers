package BSP2;

public interface ItemElement {
    <T> T accept(ItemVisitor<T> visitor);
}
