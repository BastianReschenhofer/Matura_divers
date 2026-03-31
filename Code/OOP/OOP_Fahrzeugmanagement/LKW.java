package Code.OOP.OOP_Fahrzeugmanagement;

public class LKW extends Fahrzeug{

    private double loadCap;

    public LKW(String marke, String modell, int baujahr, double loadCap) {
        super(marke, modell, baujahr);
        this.loadCap = loadCap;
    }

    @Override
    public void beschleunigen() {
        System.out.println("Das LKW der Marke " + super.marke + " beschleunigt");
    }

    public double getLoadCap(){return loadCap;}
    public void setLoadCao(double loadCap){this.loadCap = loadCap;}
    
}
