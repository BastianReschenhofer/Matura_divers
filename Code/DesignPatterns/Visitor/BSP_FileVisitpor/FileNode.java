package Code.DesignPatterns.Visitor.BSP_FileVisitpor;

public class FileNode implements FileSystemNode{

    private final String name;
    private final int size;

    FileNode(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }

    public <T> T accept(FileSystemVisitor<T> fl){
        return fl.visit(this);
    }

}
