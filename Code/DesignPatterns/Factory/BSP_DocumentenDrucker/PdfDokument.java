package Code.DesignPatterns.Factory.BSP_DocumentenDrucker;

public class PdfDokument implements Document {

    @Override
    public String print() {
        return "Drucke PdfDokuemtn....";
    }
    
}
