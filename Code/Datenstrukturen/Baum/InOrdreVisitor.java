package Code.Datenstrukturen.Baum;

public class InOrdreVisitor implements BaumVisitor{

    @Override
    public void visit(BaumNode node) {
        if(node == null) return;

        if(node.getLeft() != null) node.getLeft().accept(this);
        System.out.println(node.getData() + " ");
        if(node.getRight() != null) node.getRight().accept(this);
    }
}
