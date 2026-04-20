package Code.OOP.Bibliothek;

public class Buch extends Medium {

    private String author;

    public Buch(int id, String title, int jahr, String author) throws UngueltigesJahrExeption{
        super(id, title, jahr);
        this.author = author;
    }

    @Override
    public void printfInfo() {
        System.out.println("Das Buch " + super.getTitle() + " wurde von " + author + " geschrieben, im Jahr " + super.getJahr() );
    }
    
    public String getAuthor(){
        return this.author;
    }
}
