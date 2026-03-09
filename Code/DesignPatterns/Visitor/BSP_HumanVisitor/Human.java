package Code.DesignPatterns.Visitor.BSP_HumanVisitor;

public abstract class Human {
    private String name;
    private int age;
    private boolean gender;

    public Human(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender =gender;
    }

    public abstract String toString();
    public boolean getGender(){return gender;}
    public  int getAge(){return age;}
    public String getName(){return name;}

    public abstract <T> T accept (Visitor<T> v);
}
