package Code.DesignPatterns.Iterator.SongIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> playlist;
    private int size;

    public Playlist(){
        playlist = new ArrayList<>();
        size = 0;
    }

    public void addSong(Song song){
        playlist.add(song);
        size ++;
    }

    public Song getSong(int idx){
        return playlist.get(idx);
    }

    public int getSize(){return this.size;}

    public PlaylistIterator iterator() {
        return new PlaylistIterator(this);
    }

}
