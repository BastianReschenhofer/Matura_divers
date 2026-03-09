package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

public interface FileSystemNode {
    public <T> T accept(FileSystemVisitor<T> visior);
}
