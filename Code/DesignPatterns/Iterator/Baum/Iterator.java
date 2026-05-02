package Code.DesignPatterns.Iterator.Baum;

import Code.Handwerk.BspHandwerk1.Buch;

public interface Iterator<T> extends java.util.Iterator<Buch> {
    boolean hasNext();


    @Override
    default void remove() {
        java.util.Iterator.super.remove();
    }
} 
