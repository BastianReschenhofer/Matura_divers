package Code.DesignPatterns.Visitor.BSP_HumanVisitor;

public class Man extends Human{

    public boolean glatze;

    public Man(String name, int age, boolean gender, boolean g){
        super(name, age, gender);
        this.glatze = g;
    }

    @Override
    public String toString() {
        int age = super.getAge() ;
        if(glatze) return "Ich heiße " + super.getName() + " und bin " + age + " Jahre alt" + " und habe keine Haare";
        return "Ich heiße " + super.getName() + " und bin " + age + " Jahre alt";

    }

   

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

    
    
}
