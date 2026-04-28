package Code.Datenstrukturen.Baum;

public class BaumNode {

    private final int data;
    private BaumNode left;
    private BaumNode right;

    public BaumNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData(){return data;}
    public BaumNode getLeft(){return left;}
    public void setLeft(BaumNode left){this.left = left;}
    public BaumNode getRight(){return right;}
    public void setRight(BaumNode right){this.right = right;}

    public void accept(BaumVisitor visitor){
        visitor.visit(this);
    }
    
}
