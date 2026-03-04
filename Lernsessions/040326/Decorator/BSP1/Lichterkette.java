package BSP1;
public class Lichterkette extends Deko {

    public int length;

    public Lichterkette(int l, Baum baum){
        super.baum = baum;
        this.length = l;
    }

    @Override
    public int price() {
        return 5 * length + super.baum.price();
    }

    @Override
    public String toString() {
        return  super.baum.toString() +" mit "+ length +"m Lichterkette";
    }
    
}
