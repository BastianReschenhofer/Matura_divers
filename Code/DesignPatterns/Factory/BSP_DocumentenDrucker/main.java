package Code.DesignPatterns.Factory.BSP_DocumentenDrucker;

import javax.sound.sampled.SourceDataLine;

public class main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.getDocument("PDF");
        if(doc1 != null) System.out.println(doc1.print());

        Document doc2 = factory.getDocument("WORD");
        if(doc2 != null) System.out.println(doc2.print());
    }
}
