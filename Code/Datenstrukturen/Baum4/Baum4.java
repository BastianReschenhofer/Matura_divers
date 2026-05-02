package Code.Datenstrukturen.Baum4;

public class Baum4<T extends Comparable <T>> {

    private BaumNode4<T> root;

    public Baum4(){
        this.root = null;
    }
    public BaumNode4<T> getRoot(){return this.root;}

    public void insert(T value){
        if(root == null){
            root = new BaumNode4<>(value);
        }else{
            BaumNode4<T> current = root;
            while(true){
                if(current.getValue().compareTo(value) < 0){
                    if(current.getLeft() == null){
                        current.setLeft(new BaumNode4<>(value));
                        return;
                    }
                    current = current.getLeft();
                }else {
                    if(current.getRight() == null){
                        current.setRight(new BaumNode4<>(value));
                        return;
                    }
                    current = current.getRight();
                }
            }

        }
    }

    public boolean contains(T value){
        if(root == null) return false;
        if(root.getValue().compareTo(value) == 0) return true;
        BaumNode4<T> current = root;
        while (current != null){

            int cmp = current.getValue().compareTo(value);
            if(cmp == 0) return true;
            else if(cmp < 0){
                current = current.getLeft();
            }
            else{
                current = current.getRight();
            }
        }
        return false;
    }

    public void inOrder(BaumNode4<T> root){
        if(root == null) return;
        inOrder(root.getLeft());
        System.out.println(root.getValue());
        inOrder(root.getRight());
    }

    public void preOrder(BaumNode4<T> root){
        if(root == null) return;
        System.out.println(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void postOrder(BaumNode4<T> root){
        if(root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getValue());
    }


    public BaumNode4<T> delet(T value){
        if(root == null) return null;

        //Knoten suchen
        BaumNode4<T> current = root;
        BaumNode4<T> fcurrent = null;

        while(current.getValue().compareTo(value) != 0 && current != null){
            if(current.getValue().compareTo(value) >= 1){
                fcurrent = current;
                current = current.getLeft();
            }else{
                fcurrent = current;
                current = current.getRight();
            }
        }
        if(current == null) return null;

        BaumNode4<T> x = current;
        BaumNode4<T> fx = fcurrent;
        if(current.getRight() == null){
            //Sonderfall a
            x = current.getLeft();
        }else if(current.getRight().getLeft() == null){
            //Sonderfall b
            x = current.getRight();
            x.setLeft(current.getLeft());
        }else{
            //Knoten x suchen um current zu ersetzen
            x = x.getRight();
            while(true){
                if(x.getLeft() == null) break;
                fx = x;
                x = x.getLeft();
            }
            fx.setLeft(x.getRight());
            x.setRight(current.getRight());
            x.setLeft(current.getLeft());
        }

        //umhängen
        if(root == current) root = x;
        else if (fcurrent.getLeft() == current) {
            fcurrent.setLeft(x);
        } else {
            fcurrent.setRight(x);
        }

        current.setRight(null);
        current.setLeft(null);
        return current;

    }
}
