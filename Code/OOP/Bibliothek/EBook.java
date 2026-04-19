package Code.OOP.Bibliothek;

public class EBook extends Medium{
    private String author;
    private int size;

    public EBook(int id, String title, int jahr, String author, int size){
        super(id, title, jahr);
        this.author = author;
        this.size = size;
    }

    @Override
    public void printfInfo() {
        System.out.println("Das Buch " + super.getTitle() + " wurde von " + author + " geschrieben, im Jahr " + super.getJahr() + " mit der Größe " + size + " MB" );
    }
    
    public String getAuthor(){
        return this.author;
    }
    public int getSize(){
        return size;
    }
}
