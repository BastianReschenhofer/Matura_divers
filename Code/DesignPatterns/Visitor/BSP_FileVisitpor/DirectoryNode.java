package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

import java.util.ArrayList;
import java.util.List;

public class DirectoryNode implements FileSystemNode{

    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public DirectoryNode(String name){
        this.name = name;
    }

    public void add(FileSystemNode child){
        children.add(child);
    }

    public String getName(){
        return name;
    }

    public List<FileSystemNode> getChildren(){
        return children;
    }
    
    @Override
    public <T> T accept(FileSystemVisitor<T> dv) {
        return dv.visit(this);
    }

    
}
