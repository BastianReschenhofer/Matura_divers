package Code.Sort.Tierpark;

public class Tier implements Comparable<Tier>{
    private String name;
    final private String art;
    final private int alter;
    private Tier next;

    public Tier(String name, String art, int alter){
        this.name = name;
        this.alter = alter;
        this.art = art;
        this.next = null;
    }

    public String getName(){
        return this.name;
    }
    public String getArt(){
        return this.art;
    }
    public int getAlter(){
        return this.alter;
    }
    public Tier getNext(){return  this.next;}

    public void setName(String newName){
        this.name = newName;
    }
    public void setNext(Tier next){this.next = next;}

    public int compareTo(Tier other ){
        if(other.getAlter() > this.alter) return -1;
        if(other.getAlter() < this.alter) return 1;
        return 0;
    }

}
