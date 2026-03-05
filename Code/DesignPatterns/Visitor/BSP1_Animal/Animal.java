package Code.DesignPatterns.Visitor.BSP1_Animal;


public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract String toString();

    public abstract <T> T accept(Visitor<T> v);

}
