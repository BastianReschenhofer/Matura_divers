package Code.Datenstrukturen.LinkedStringList;

public class StringNode {
    private final char data;
    private StringNode next;
    public StringNode(char data){
        this.data = data;
        this.next = null;
    }

    public char getData(){return data;}
    public StringNode getNext(){return next;}
    public void setNext(StringNode next){this.next = next;}
}
