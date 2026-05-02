package Code.DesignPatterns.Iterator.SongIterator;

public class SongIteratorDemoa {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Imagine", 183));
        playlist.addSong(new Song("Let It Be", 243));
        playlist.addSong(new Song("Yesterday", 125));

        PlaylistIterator iterator = playlist.iterator();

        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            song.play();
        }
    }
}
