package Code.DesignPatterns.Iterator.LagerIterator;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private List<Product> shelf;
    int size;

    public Shelf(){
        shelf = new ArrayList<>();
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public Product get(int idx){
        return shelf.get(idx);
    }

    public void addProduct(Product p){
        shelf.add(p);
        size++;
    }

    public ShelfIterator iterator(){
        return new ShelfIterator(this);
    }
}
