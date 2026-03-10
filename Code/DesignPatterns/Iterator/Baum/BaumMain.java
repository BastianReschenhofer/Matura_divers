package Code.DesignPatterns.Iterator.Baum;

public class BaumMain {

    public static void main(String[] args) {
        Baum baum = new Baum(new Node("Mittelpunkt"));
        baum.addNode("Alpha");
        baum.addNode("Beta");
        baum.addNode("Gamma");
        baum.addNode("Delta");

        System.out.println("In-Order Traversal:");
        baum.printInOrder(baum.getRoot());

        System.out.println("\nPre-Order Traversal:");
        baum.printPreOrder(baum.getRoot());

        System.out.println("\nPost-Order Traversal:");
        baum.printPostOrder(baum.getRoot());

        System.out.println("\nDeleting 'Beta'...");
        baum.deleteNode("Beta");

        System.out.println("\nIn-Order Traversal after deletion:");
        baum.printInOrder(baum.getRoot());
    }
    
}
