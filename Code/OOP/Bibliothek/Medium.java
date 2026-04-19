package Code.OOP.Bibliothek;

public abstract class Medium {
    private int id;
    private String title;
    private int jahr;

    public Medium(int id, String title, int jahr){
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

}
