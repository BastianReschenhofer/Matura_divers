package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public class main {
    public static void main(String[] args) {
        
        DonerMann Hasan = new DonerMann();

        Doner d1 = Hasan.bestellDoner("alles");
        if(d1!=null)System.out.println(d1.getZutaten()+"  Preis:"+d1.getPreis());

        Doner d2 = Hasan.bestellDoner("scharf");
        if(d2!=null)System.out.println(d2.getZutaten()+"  Preis:"+d2.getPreis());
    }
}
