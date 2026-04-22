package Code.Refelctions.BSP_CarFactory;

import java.util.Locale;

public class BMW implements Car{
    private String zustand;
    private final int ps;
    private String color;

    public BMW(){
        this.zustand = "gebraucht";
        this.ps = 0;
        this.color = "UnDef";
    }

    public BMW(int ps){
        this.zustand = "gebraucht";
        this.ps = ps;
        this.color = "UnDef";
    }

    public BMW(String color, int ps){
        this.zustand = "gebraucht";
        this.ps = ps;
        this.color = color;
    }

    public void setZustand(String newZustand){
        switch (newZustand.toLowerCase()){
            case "gebraucht":
                this.zustand = "gebraucht";
                break;
            case "neu":
                this.zustand = "neu";
                break;
            default:
                System.out.println("Kein gütiger Zustand! aktueller Zustand: " + zustand);
        }

    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println(color+" BMW mit "+ps+" macht BRUMBRUM");
    }

    @Override
    public String info() {
        return "[BMW; Frabe: "+color+" PS: "+ps+" Zustand: "+zustand+"]";
    }
}
