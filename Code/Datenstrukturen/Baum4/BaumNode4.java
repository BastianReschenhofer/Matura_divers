package Code.Datenstrukturen.Baum4;


import Code.Datenstrukturen.Baum.Baum;
import Code.Datenstrukturen.Baum3.BaumNode3;

public class BaumNode4 <T>{
    private final T value;
    private boolean visited;

    private BaumNode4<T> left;
    private BaumNode4<T> right;

    public BaumNode4(T value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.visited = false;
    }

    public T getValue(){return this.value;}
    public BaumNode4<T> getLeft(){return this.left;}
    public BaumNode4<T> getRight(){return this.right;}
    public boolean isVisited(){return this.visited;}

    public void setVisited(boolean newState){this.visited = newState;}
    public void setLeft(BaumNode4<T> newLeft){this.left = newLeft;}
    public void setRight(BaumNode4<T> newRight){this.right = newRight;}

}
