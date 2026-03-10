package Code.DesignPatterns.Iterator.Baum;

import java.util.NoSuchElementException;
import java.util.Stack;

public class InOrderIterator implements Iterator<Node> {
    private Node root;
    private Stack<Node> stack;

    public InOrderIterator(Node root) {
        this.root = root;
        this.stack = new Stack<>();
        pushLeft(root);
    }

    private void pushLeft(Node node) {
        while (node != null) {
            stack.push(node);
            node = node.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Node next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Node currentNode = stack.pop();
        pushLeft(currentNode.getRight());
        return currentNode;
    }
    
}
