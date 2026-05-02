package Code.DesignPatterns.Iterator.SongIterator;

import java.util.Iterator;

public class PlaylistIterator implements Iterator {

    private Playlist playlist;
    public int index;

    public PlaylistIterator(Playlist playlist){
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index <  playlist.getSize();
    }

    @Override
    public Object next() {
        if(!hasNext())throw new NoMoreSongs("No more songs");
        return playlist.getSong(index++);
    }
}
