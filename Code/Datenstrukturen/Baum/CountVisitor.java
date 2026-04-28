package Code.Datenstrukturen.Baum;

public class CountVisitor implements BaumVisitor{

    private int count = 0;

    @Override
    public void visit(BaumNode node) {
        if(node == null) return;

        count++;
        if(node.getLeft() != null) node.getLeft().accept(this);
        if(node.getRight() != null) node.getRight().accept(this);
    }

    public int getCount(){return this.count;}
}
