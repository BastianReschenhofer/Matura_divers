package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

public class FileVisitorMain {
     public static void main(String[] args) {
        DirectoryNode root = new DirectoryNode("root");
        root.add(new FileNode("a.txt", 10));
        root.add(new FileNode("b.txt", 20));

        DirectoryNode sub = new DirectoryNode("sub");
        sub.add(new FileNode("c.txt", 5));
        sub.add(new FileNode("d.txt", 15));

        root.add(sub);

        SizeVisitor visitor = new SizeVisitor();
        int totalSize = root.accept(visitor);

        System.out.println("Gesamtgröße in KB: " + totalSize);

        AmountVisitor visitor2 = new AmountVisitor();
        int amount = root.accept(visitor2);
        System.out.println("Menge an Dateine: " + amount);
    }
}
