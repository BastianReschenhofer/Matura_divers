package Code.OOP.Bibliothek;

public class BibliotheMain {
    public static void main(String[] args) {
        Medium[] medien = new Medium[4];

        try{
            medien[0] = new Buch(1, "Der Herr der Ringe", 1954, "J.R.R. Tolkien");
            medien[1] = new DVD(2, "Inception", 2010);
            medien[2] = new Buch(3, "Harry Potter und der Stein der Weisen", 1997, "J.K. Rowling");
            medien[3] = new DVD(4, "The Matrix", 1999);
        }catch (UngueltigesJahrExeption e){
            System.out.println(e.getMessage());
        }
        

        System.out.println("Unsortierte Medien:");
        for (Medium medium : medien) {
            medium.printfInfo();
        }

        
        java.util.Arrays.sort(medien);
        System.out.println("\nMedien sortiert nach Titel:");
        for (Medium medium : medien) {
            medium.printfInfo();
        }

        java.util.Arrays.sort(medien, new MediumYearComparator());
        System.out.println("\nMedien sortiert nach Jahr:");
        for (Medium medium : medien) {
            medium.printfInfo();
        }

        //alle aus 2000 entfernen
        Medium[] ohne2000 = new Medium[medien.length];
        int index = 0;

        for (Medium medium : medien) {
            if(medium.getJahr() != 2000){
                ohne2000[index] = medium;
                index ++;
            }
        }

        try{
            Medium a = findbyID(1, medien);
            System.out.println(a.getTitle());
        } catch (MediumNotFount e){
            System.out.println(e.getMessage());
        }

        

    }

    public static Medium findbyID(int id, Medium[] medien) throws MediumNotFount{

        for(Medium m : medien){
            if(id == m.getID()) return m;
        }

        throw new MediumNotFount("Medium mit der ID " + id + " nicht gefunden");
    }
}
