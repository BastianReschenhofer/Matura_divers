package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

public class AmountVisitor implements FileSystemVisitor<Integer> {

    @Override
    public Integer visit(FileNode file) {
        return 1;
    }

    @Override
    public Integer visit(DirectoryNode directory) {
        int sum = 0;
        for(FileSystemNode c : directory.getChildren()){
            sum += c.accept(this);
        }
        return sum;
    }
}
