package Code.DesignPatterns.Factory.BSP_Doner_Factory_Dec;

public class DonerMann {
    
    public Doner bestellDoner(String menu){

        if(menu.equalsIgnoreCase("normal")){
            return new StandartDoner();
        }

        if(menu.equalsIgnoreCase("scharf")){
            return new Scharf(new StandartDoner());
        }

        if(menu.equalsIgnoreCase("alles")){
            return new Schafkase(new Scharf(new ExtraFleisch(new StandartDoner())));
        }

        return null;
    }
}
