package Code.Datenstrukturen.Baum3;


public class BaumNode3 {
    private BaumNode3 left;
    private BaumNode3 right;
    private final int value;
    private boolean isVisited;

    public BaumNode3(int value){
        this.value = value;
        this.left =  null;
        this.right = null;
        this.isVisited = false;
    }

    public BaumNode3 getLeft(){
        return this.left;
    }
    public BaumNode3 getRight(){
        return this.right;
    }
    public int getValue(){
        return this.value;
    }
    public boolean isVisited(){
        return this.isVisited;
    }

    public void setLeft(BaumNode3 newLeft){
        this.left = newLeft;
    }
    public void setRight(BaumNode3 newRight) {
        this.right = newRight;
    }
    public void setVisited(boolean v){
        this.isVisited = v;
    }

}
