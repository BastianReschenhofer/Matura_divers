package Code.DesignPatterns.Visitor.BSP_Plant;

import javax.sound.sampled.SourceDataLine;

public class PlantMain {
    
    public static void main(String[] args) {
        Blume blume = new Blume(" Wiese ");
        Gras gras = new Gras(" GrüneWiese ");

        VorkommenVisitor v = new VorkommenVisitor();

   
        System.out.println(blume.accept(v));
        System.out.println(gras.accept(v));
        
    }
    
}
