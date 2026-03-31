package Code.OOP.OOP_Fahrzeugmanagement;

public class Auto extends Fahrzeug {

    private final int tueren;

    public Auto(String marke, String modell, int baujahr, int tueren) {
        super(marke, modell, baujahr);
        this.tueren = tueren;
    }

    @Override
    public void beschleunigen() {
        System.out.println("Das Auto der Marke " + super.marke + " beschleunigt");
        
    }

    public int getTueren(){return this.tueren;}
    
}
