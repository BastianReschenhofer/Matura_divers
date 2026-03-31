package Code.OOP.OOP_Fahrzeugmanagement;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeugverwaltung {
    
    public List<Fahrzeug> Fahrzeuge;

    public Fahrzeugverwaltung(){
        Fahrzeuge = new ArrayList<Fahrzeug>();
    }

    public void addFahrzeug(Fahrzeug f){
        Fahrzeuge.add(f);
    }

    public void detailsAlle(){
        for(Fahrzeug f : Fahrzeuge){
            System.out.println(f.getDetails());
        }
    }

    public void beschleunigenAlle(){
        for(Fahrzeug f : Fahrzeuge){
            f.beschleunigen();
        }
    }

    public List<Fahrzeug> sucheNachMarke(String marke){

        List<Fahrzeug> gf = new ArrayList<Fahrzeug>();
        for(Fahrzeug f : Fahrzeuge){
            if(f.getMarke().equals(marke)){
                gf.add(f);
            }
        }
        return gf;
    }
    

}
