package Code.OOP.OOP_Fahrzeugmanagement;

public abstract class Fahrzeug {

    protected final String marke;
    protected final String modell;
    protected final int baujahr;
    
    public Fahrzeug(String marke, String modell, int baujahr){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public abstract void beschleunigen();
    public String getDetails(){
        String s = "Marke: " + marke + "; Modell: " + modell + "; Baujahr: " + baujahr;
        return s;
    }

}
