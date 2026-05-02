package Code.DesignPatterns.Iterator.SongIterator;

public class Song {
    private String title;
    private int lenght;

    public Song(String title, int lenght){
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle(){return this.title;}
    public int getLenght(){return this.lenght;}
    public void play(){System.out.print(title + " " + lenght + "min ,");}
}
