package Code.OOP.Bibliothek;

public abstract class Medium implements Comparable<Medium> {
    private int id;
    private String title;
    private int jahr;

    public Medium(int id, String title, int jahr) throws UngueltigesJahrExeption{
        if(jahr < 0) throw new UngueltigesJahrExeption("Jahr darf nicht kleiner als null sein");
        this.id = id;
        this.title = title;
        this.jahr = jahr;
    }

    public abstract void printfInfo();

    public int getID(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public int getJahr(){
        return this.jahr;
    }

    @Override
    public int compareTo(Medium other) {
        return this.title.compareTo(other.title);
    }

}
