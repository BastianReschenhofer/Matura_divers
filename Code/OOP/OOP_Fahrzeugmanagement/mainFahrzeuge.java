package Code.OOP.OOP_Fahrzeugmanagement;

public class mainFahrzeuge {
    public static void main(String[] args) {
        
        Fahrzeugverwaltung f1 = new Fahrzeugverwaltung();

        Auto auto1 = new Auto("emmsi", "Rennraktet", 2006, 1);
        LKW lkw1 = new LKW("bums", "bams", 1, 0.1);

        f1.addFahrzeug(auto1);
        f1.addFahrzeug(lkw1);
        f1.beschleunigenAlle();
        f1.detailsAlle();


    }
}
