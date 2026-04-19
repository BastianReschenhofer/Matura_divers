package Code.OOP.Bibliothek;

public class DVD extends Medium{

    public DVD(int id, String title, int jahr){
        super(id, title, jahr);
    }
    
    @Override
    public void printfInfo() {
        System.out.println("Die DVD " + super.getTitle() + " erschien im Jahr " + super.getJahr());
    }
}
