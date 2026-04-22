package Code.Datenstrukturen.Baum2;


public class    Baum2 {

    private NodeBaum2<Integer> root;

    public Baum2(){
        this.root = null;
    }


    public void insert(int value) {
        if (root == null) {
            root = new NodeBaum2<Integer>(value);
            return;
        }

        NodeBaum2<Integer> tmp = root;

        while (true) {
            if (value < tmp.getValue()) {
                if (tmp.getLeft() == null) {
                    tmp.setLeft(new NodeBaum2<Integer>(value));
                    return;
                }
                tmp = tmp.getLeft();
            } else {
                if (tmp.getRight() == null) {
                    tmp.setRight(new NodeBaum2<Integer>(value));
                    return;
                }
                tmp = tmp.getRight();
            }
        }
    }

    public boolean includes(int value) {
        NodeBaum2<Integer> tmp = root;

        while (tmp != null) {
            if (value == tmp.getValue()) {
                return true;
            } else if (value < tmp.getValue()) {
                tmp = tmp.getLeft();
            } else {
                tmp = tmp.getRight();
            }
        }
        return false;
    }

    public NodeBaum2<Integer> max(){
        NodeBaum2<Integer> tmp = root;

        while(tmp.getRight() != null){
            tmp = tmp.getRight();
        }
        return tmp;
    }

    public NodeBaum2<Integer> min(){
        NodeBaum2<Integer> tmp = root;

        while(root.getLeft() != null){
            tmp = tmp.getLeft();
            
        }
        return tmp;
    }

    public int height() {
        return heightrec(root);
    }

    private int heightrec(NodeBaum2<Integer> node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = heightrec(node.getLeft());
        int rightHeight = heightrec(node.getRight());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public NodeBaum2<Integer> delet(int value){

        NodeBaum2<Integer> father = null;
        NodeBaum2<Integer> p = root;


        //suchen im Baum
        while(p != null && p.getValue() != value){
            father = p;
            if(p.getValue() > value) p = p.getLeft();
            else p = p.getRight();
        }

        //suchen des Knoten der p ersetzt
        NodeBaum2<Integer> x;

        if(p.getRight() == null){
            //Sonderfall a -> kein rechter Unterbaum vorhanden
            x = p.getLeft();
        }else if(p.getRight().getLeft() == null){
            //Sonderfall b -> kleinster Knoten im Rechten Unterbaum ist Sohn von p
            x = p.getRight();
            x.setLeft(p.getLeft());
        }else {
            NodeBaum2<Integer> xf = p.getRight();
            x = xf.getLeft();
            while(x.getLeft() != null){
                xf = x;
                x = x.getLeft();
            }

            xf.setLeft(x.getRight());
            x.setLeft(p.getLeft());
            x.setRight(p.getRight());

        }
        if (p == root) root = x;
        else if (value < father.getValue()) father.setLeft(x);
        else father.setRight(x);
        p.setLeft(null);
        p.setRight(null);
        return p;
    }

    public int count(){
        return countrec(root);
    }
    private int countrec(NodeBaum2<Integer> root){
        if (root == null) return 0;
        return countrec(root.getLeft()) + countrec(root.getRight()) +1;
    }
}
