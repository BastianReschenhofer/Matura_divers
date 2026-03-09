package Code.DesignPatterns.Visitor.BSP_HumanVisitor;

public class Woman extends Human{

    public boolean zopf;

    public Woman(String name, int age, boolean gender, boolean zopf){
        super(name, age, gender);
        this.zopf = zopf;
    }

    @Override
    public String toString() {
        int age = super.getAge() ;
        if(zopf) return "Ich heiße " + super.getName() + " und bin " + age + " Jahre alt" + " und habe einen Zopf";
        return "Ich heiße " + super.getName() + " und bin " + age + " Jahre alt";
    }

    @Override
    public <T> T accept(Visitor<T> v) {
       return v.visit(this);
    }
}
