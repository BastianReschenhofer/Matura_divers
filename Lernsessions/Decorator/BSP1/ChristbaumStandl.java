package Lernsessions.Decorator.BSP1;

public class ChristbaumStandl {
    
    public Baum ChristbaumGünstig(){
        return new Lichterkette(2,new Fichte());
    }

    public Baum ChristbaumStandard(){
        return new Lichterkette(3, new Tanne());
    }

    public Baum ChristbaumPremium(){
        return new Stern(new Stern(new Lichterkette(5, new Tanne())));
    }

}
