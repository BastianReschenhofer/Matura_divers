package Code.Datenstrukturen.Baum2;

public class NodeBaum2<T> {
    private NodeBaum2<T> right;
    private NodeBaum2<T> left;

    private T value;

    public NodeBaum2(T value){
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public T getValue(){
        return this.value;
    }
    public NodeBaum2<T> getRight(){
        return this.right;
    }
    public NodeBaum2<T> getLeft(){
        return this.left;
    }

    public void setRight(NodeBaum2<T> node){
        right = node;
    }
    public void setLeft(NodeBaum2<T> node){
        left = node;
    }
    

}
