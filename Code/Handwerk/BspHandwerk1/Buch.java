package Code.Handwerk.BspHandwerk1;

public class Buch implements Comparable<Buch> {
    private String titel;
    private String author;
    private int seiten;

    public Buch(String titel, String author, int seiten) {
        this.titel = titel;
        this.author = author;
        this.seiten = seiten;
    }

    public String getTitle(){
        return this.titel;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getSeiten(){
        return this.seiten;
    }

    public int compareTo(Buch other){
        return this.titel.compareToIgnoreCase(other.getTitle());
    }

    public String toString() {
        return titel + " von " + author + " (" + seiten + " Seiten)";
    }


}
