package Code.DesignPatterns.Iterator.SongIterator;

public class NoMoreSongs extends RuntimeException {
    public NoMoreSongs(String message) {
        super(message);
    }
}
