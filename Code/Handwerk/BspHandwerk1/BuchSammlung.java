package Code.Handwerk.BspHandwerk1;

import java.util.NoSuchElementException;

import Code.DesignPatterns.Iterator.Baum.Iterator;

public class BuchSammlung implements Iterable<Buch> {

    public Buch[] buecher;
    private int anzahl;

    public BuchSammlung(int size){
        buecher = new Buch[size];
        this.anzahl = 0;
    }

    public void printBuecher(){
        for(Buch b : buecher){
            System.out.println(b.toString());
        }
    }

    public void add(Buch b){
        if(anzahl == buecher.length){
            System.out.println("Bucher voll!");
            return;
        }
            
        buecher[anzahl++] = b;
    }

    public Iterator<Buch> iterator(){
        return new Iterator<Buch>() {
            private int index = 0;

            public boolean hasNext(){
                return index < anzahl;
            }

            public Buch next(){
                if(!hasNext()){
                    throw NoSuchElementException();
                }
                return buecher[index ++];
            }
        };
    }
}
