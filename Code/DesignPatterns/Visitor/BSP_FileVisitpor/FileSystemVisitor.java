package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

public interface FileSystemVisitor<T> {
    public T visit(FileNode file);
    public T visit(DirectoryNode directory);
}
