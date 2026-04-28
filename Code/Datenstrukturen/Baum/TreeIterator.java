package Code.Datenstrukturen.Baum;

import Code.DesignPatterns.Iterator.Baum.Iterator;

public class TreeIterator implements Iterator<Integer> {

    private java.util.Stack<BaumNode> stack = new java.util.Stack<>();

    public void TreeIterator(BaumNode root){
        pushLeft(root);
    }
    private void pushLeft(BaumNode node){
        while(node != null){
            stack.push(node);
            node = node.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {
        BaumNode current = stack.pop();
        int result = current.getData();

        if(current.getRight() != null) pushLeft(current.getRight());
        return result;
    }
}
