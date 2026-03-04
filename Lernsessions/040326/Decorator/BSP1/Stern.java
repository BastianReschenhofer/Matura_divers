package BSP1;

public class Stern extends Deko {
    

    public Stern(Baum baum){
        super.baum = baum;
    }

    @Override
    public int price() {
        return 8 + super.baum.price();
    }

    @Override
    public String toString() {
        return super.baum.toString() + " mit " + "Weihnachtsstern";
    }
}
