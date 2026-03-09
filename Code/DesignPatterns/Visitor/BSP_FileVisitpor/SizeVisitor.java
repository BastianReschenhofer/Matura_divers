package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

public class SizeVisitor implements FileSystemVisitor<Integer>{

    @Override
    public Integer visit(FileNode file) {
        return file.getSize();
    }

    @Override
    public Integer visit(DirectoryNode directory) {
        int sum = 0;

        for(FileSystemNode childe : directory.getChildren()){
            sum += childe.accept(this);
        }

        return sum;
    }
    
}
