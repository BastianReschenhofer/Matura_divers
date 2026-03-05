package Code.DesignPatterns.Visitor.BSP1_Animal;

public class main {
    public static void main(String[] args) {
        

        Lowe Peter = new Lowe("Peter");
        Giraffe Susanne = new Giraffe("Susanne");
        Kamel Harri = new Kamel("Harri");

        AnimalVisitor v = new AnimalVisitor();

        System.out.println(Peter.accept(v));
        System.out.println(Susanne.accept(v));        
        System.out.println(Harri.accept(v));

    }
}
