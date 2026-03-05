package Code.DesignPatterns.Factory.BSP_Coffe;


public class CoffeFactory {
    
    public Coffe makeCoffe(String name){

        if(name == null) return null;

        if(name.equalsIgnoreCase("Verlängerter")){
            return new StandardCoffe();
        }

        if(name.equalsIgnoreCase("Cappu")){
            return new Milchschaum(new Milchschaum(new StandardCoffe()));
        }

        if(name.equalsIgnoreCase("Milch")){
            return new Milch(new StandardCoffe());
        }

        System.out.println("Kein passender Kaffe gespeichert");
        return null;
    }
}
