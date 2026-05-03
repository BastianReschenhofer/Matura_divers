package Code.Hashen.BSP_Autoteile;

import java.util.Objects;

public class AutoTeil implements Comparable<AutoTeil> {
    private int teilNr;
    private double preis;
    private AutoTeil next;

    public AutoTeil(int teilNr, double preis){
        this.teilNr = teilNr;
        this.preis = preis;
        this.next = null;
    }

    public int getTeilNr(){return this.teilNr;}
    public double getPreis(){return this.preis;}
    public AutoTeil getNext() {return next;}

    public void setTeilNr(int newTeilNr){this.teilNr = newTeilNr;}
    public void setPreis(double newPreis){this.preis = newPreis;}
    public void setNext(AutoTeil newAutoTeil){this.next = newAutoTeil;}

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof AutoTeil)) return false;
        return ((AutoTeil) obj).getTeilNr() == this.teilNr && ((AutoTeil) obj).getPreis() == this.preis;
    }
    @Override
    public int hashCode(){
        return Objects.hash(teilNr);
    }
    @Override
    public int compareTo(AutoTeil o) {
        return 0;
    }
    @Override
    public String toString() {
        return teilNr + " (" + preis + "€)";
    }
}
