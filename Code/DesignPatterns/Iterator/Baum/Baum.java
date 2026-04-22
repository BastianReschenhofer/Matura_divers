package Code.DesignPatterns.Iterator.Baum;

import java.util.Iterator;

public class Baum {
    public Node root;
    public Baum(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addNode(String name) {
        root = addNodeRecursively(root, name);
    }

    private Node addNodeRecursively(Node root2, String name) {
        if (root2 == null) {
            return new Node(name);
        }

        if (name.compareTo(root2.getName()) < 0) {
            root2.setLeft(addNodeRecursively(root2.getLeft(), name));
        } else if (name.compareTo(root2.getName()) > 0) {
            root2.setRight(addNodeRecursively(root2.getRight(), name));
        }

        return root2;
    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.println(node.getName());
            printInOrder(node.getRight());
        }
    }

    public void printPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.getName());
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    public void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.println(node.getName());
        }
    }

    public void deleteNode(String name) {
        root = deleteNodeRecursively(root, name);
    }

    private Node deleteNodeRecursively(Node root2, String name) {
        if (root2 == null) {
            return root2;
        }

        if (name.compareTo(root2.getName()) < 0) {
            root2.setLeft(deleteNodeRecursively(root2.getLeft(), name));
        } else if (name.compareTo(root2.getName()) > 0) {
            root2.setRight(deleteNodeRecursively(root2.getRight(), name));
        } else {
            if (root2.getLeft() == null) {
                return root2.getRight();
            } else if (root2.getRight() == null) {
                return root2.getLeft();
            }

            root2.setName(findMinValue(root2.getRight()));
            root2.setRight(deleteNodeRecursively(root2.getRight(), root2.getName()));
        }

        return root2;
    }

    private Object findMinValue(Node right) {
        String minValue = right.getName();
        while (right.getLeft() != null) {
            minValue = right.getLeft().getName();
            right = right.getLeft();
        }
        return minValue;
    }


    
}
