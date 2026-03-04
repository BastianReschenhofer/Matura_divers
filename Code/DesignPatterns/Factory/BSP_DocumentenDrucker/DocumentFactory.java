package Code.DesignPatterns.Factory.BSP_DocumentenDrucker;

public class DocumentFactory {
    
    public Document getDocument(String type){
        if(type == null){
            return null;
        }

        if(type.equalsIgnoreCase("PDF")) return new PdfDokument();
        if(type.equalsIgnoreCase("WORD")) return new WordDokument();

        System.out.println("Dokumententyp nicht vorhanden!");
        return null;
    }
}
