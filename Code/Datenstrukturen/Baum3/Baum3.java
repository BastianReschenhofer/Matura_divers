package Code.Datenstrukturen.Baum3;

import Code.Datenstrukturen.Baum.Baum;
import Code.Testen.ListTest.NoSuchValueException;

public class Baum3 {

    private BaumNode3 head;

    public Baum3(){
        head = null;
    }

    public void insert(int value){
        if(head == null){
            head = new BaumNode3(value);
            return;
        }

        BaumNode3 current = head;
        while(true){
            if(current.getValue() <= value){
                if(current.getRight() == null) {
                    current.setRight(new BaumNode3(value));
                    return;
                }
                current = current.getRight();
            }
            if(current.getValue() > value){
                if(current.getLeft() == null) {
                    current.setRight(new BaumNode3(value));
                    return;
                }
                current = current.getLeft();
            }
        }
    }

    public BaumNode3 delet(int value){

        //Knoten im Baum suchen
        BaumNode3 father = null;
        BaumNode3 p = head;

        while(p != null){
            father = p;
            if(p.getValue() == value)break;
            if(value >= p.getValue())p = p.getRight();
            else p = p.getLeft();
        }
        if(p==null) throw new NoSuchValueException("Kein Node mit diesem Wert vorhanden");

        //Node x wird Node p ersetzen
        BaumNode3 x = p;
        BaumNode3 xf = null;

        if(p.getRight() == null){
            x = p.getLeft();
        }else if(p.getRight().getLeft() == null){
            x = p.getRight();
            x.setLeft(p.getLeft());
        }else{
            xf = p.getRight();
            x = p.getRight().getLeft();
            while(x.getLeft() != null){
                xf = x;
                x = x.getLeft();
            }
            xf = x.getRight();
            x.setLeft(p.getLeft());
            x.setRight(p.getRight());
        }
        if(head == p) head = x;
        else if(value < father.getValue()) father.setLeft(x);
        else father.setRight(x);
        p.setLeft(null);
        p.setRight(null);
        return p;
    }


    public boolean contains(int value){
        BaumNode3 current = head;
        while(current != null){
            if(current.getValue() == value) return true;
            if(value >= current.getValue()) current = current.getRight();
            else current = current.getLeft();
        }
        return false;
    }

    public int size(){
        return sizeRec(head);
    }
    private int sizeRec(BaumNode3 current){
        if(current == null) return 0;
        return sizeRec(current.getLeft()) + sizeRec(current.getRight()) + 1;
    }

    public void preOrder(){
        preOrderRec(head);
    }
    private void preOrderRec(BaumNode3 p){
        if(p == null) return;
        System.out.println(p.getValue());
        preOrderRec(p.getLeft());
        preOrderRec(p.getRight());
    }

    public void postOrder(){
        postOrderRec(head);
    }
    private void postOrderRec(BaumNode3 p){
        if(p==null) return;
        postOrderRec(p.getLeft());
        postOrderRec(p.getRight());
        System.out.println(p.getValue());
    }

    public void inOrder(){
        inOrderRec(head);
    }
    private void inOrderRec(BaumNode3 p){
        if(p==null)return;
        inOrderRec(p.getLeft());
        System.out.println(p.getValue());
        inOrderRec(p.getRight());
    }


}
