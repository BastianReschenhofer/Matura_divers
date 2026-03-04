package Code.DesignPatterns.Factory.BSP_DocumentenDrucker;

public class WordDokument implements Document {

    @Override
    public String print() {
        return "Drucke WordDokument....";
    }
    
}
