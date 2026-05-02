package Code.DesignPatterns.Iterator.LagerIterator;

import java.util.Iterator;

public class ShelfIterator implements Iterator<Product> {

    private Shelf shelf;
    private int idx;

    public ShelfIterator(Shelf shelf){
        this.shelf = shelf;
        idx = 0;

    }
    @Override
    public boolean hasNext() {
        return idx < shelf.size;
    }

    @Override
    public Product next() {
        if(!hasNext()) return null;
        while(hasNext() && shelf.get(idx).getPrice() < 20){
            idx++;
        }
        return shelf.get(idx++);
    }
}
