package Code.OOP.OOP_Fahrzeugmanagement;

public class Motorrad extends Fahrzeug {

    private boolean beiwagen;

    public Motorrad(String marke, String modell, int baujahr, boolean beiwagen) {
        super(marke, modell, baujahr);
        this.beiwagen = beiwagen;
    }

    @Override
    public void beschleunigen() {
        System.out.println("Das Motorrad der Marke " + super.marke + " beschleunigt");
        
    }

    public boolean getBeiwagen(){return beiwagen;}
    public void setBeiwagen(boolean b){this.beiwagen = b;}
    
}
