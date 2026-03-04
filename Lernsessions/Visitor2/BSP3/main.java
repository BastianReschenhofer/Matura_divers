package BSP3;

public class main {
    public static void main(String[] args) {
        
        Sau Susi = new Sau("Susi", true);
        Rindviech Paula = new Rindviech("Paula", true);

        Visitor v = new SpeekVisitor();
        System.out.println(Paula.accept(v));
        System.out.println(Susi.accept(v));

    }
}
